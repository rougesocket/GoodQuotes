package io.rougesocket.GoodQuotes.repository;

import io.rougesocket.GoodQuotes.model.Quote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepo extends MongoRepository<Quote,String> , RandomQuotesRepo {

    Page<Quote> findAllByAuthor(String Author,Pageable pageable);

    Page<Quote> findAllByCategory(String category, Pageable pageable);

    Page<Quote> findAllByOrderByPopularityDesc(Pageable pageable);

    Page<Quote> findByTagsIn(List<String> tags,Pageable pageable);
}
