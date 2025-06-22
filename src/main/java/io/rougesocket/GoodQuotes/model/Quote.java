package io.rougesocket.GoodQuotes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "goodquotes")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    @Id
    private String id;
    @Field("Quote")
    private String quote;
    @Field("Author")
    private String author;
    @Field("Category")
    private String category;
    @JsonIgnore
    @Field("Popularity")
    private String popularity;


    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Quote() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Quote(String id, String quote, String author, String category, String popularity) {
        this.id = id;
        this.quote = quote;
        this.author = author;
        this.category = category;
        this.popularity = popularity;
    }
}
