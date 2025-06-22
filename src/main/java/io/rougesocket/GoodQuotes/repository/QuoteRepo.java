package io.rougesocket.GoodQuotes.repository;

import io.rougesocket.GoodQuotes.model.Quote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepo extends MongoRepository<Quote,String> {

    Page<Quote> findAllByAuthor(String Author,Pageable pageable);
}
