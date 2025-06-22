package io.rougesocket.GoodQuotes.service;

import io.rougesocket.GoodQuotes.model.Quote;
import io.rougesocket.GoodQuotes.repository.QuoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuotesService {

    @Autowired
    private QuoteRepo repo;

    public Optional<Quote> getQuoteById(String id) {
        return repo.findById(id);
    }

    public Page<Quote> getQuotesByAuthor(String author,Pageable pageable){
        return repo.findAllByAuthor(author,pageable);
    }

    public Page<Quote> getAllQuotesByCategory(String category, Pageable pageable) {
        return repo.findAllByCategory(category,pageable);
    }

    public Page<Quote> getQuotesByPopularity(Pageable pageable) {
        return repo.findAllByOrderByPopularityDesc(pageable);
    }
}
