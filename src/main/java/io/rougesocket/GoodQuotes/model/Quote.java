package io.rougesocket.GoodQuotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goodquotes")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    @Id
    private String id;
    private String Quote;
    private String Author;

    public Quote() {
    }

    public Quote(String id, String quote, String author) {
        this.id = id;
        this.Quote = quote;
        this.Author = author;
    }
    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        this.Quote = quote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

}
