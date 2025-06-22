package io.rougesocket.GoodQuotes.repository;

import io.rougesocket.GoodQuotes.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class QuoteRepoImpl implements RandomQuotesRepo{

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public Optional<Quote> getRandomQuote() {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.sample(1)
        );

        AggregationResults<Quote> results = mongoTemplate.aggregate(
                aggregation,
                "goodquotes",
                Quote.class
        );

        return  Optional.ofNullable(results.getUniqueMappedResult());
    }
}
