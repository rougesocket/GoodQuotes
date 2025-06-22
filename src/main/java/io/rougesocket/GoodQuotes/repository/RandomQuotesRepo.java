package io.rougesocket.GoodQuotes.repository;

import io.rougesocket.GoodQuotes.model.Quote;

import java.util.Optional;

public interface RandomQuotesRepo {

    Optional<Quote> getRandomQuote();
}
