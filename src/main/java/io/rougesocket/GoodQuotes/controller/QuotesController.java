package io.rougesocket.GoodQuotes.controller;

import io.rougesocket.GoodQuotes.model.Quote;
import io.rougesocket.GoodQuotes.service.QuotesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
@Tag(name = "GoodQuotes", description = "Operations related to quotes")
public class QuotesController {
    @Autowired
    private QuotesService service;

    @GetMapping("/{id}")
    public Quote getQuote(@PathVariable String id){
        return service.getQuoteById(id).orElseThrow();
    }

    @GetMapping("/author/{author}")
    public PagedModel<Quote> getQuotesByAuthor(@PathVariable String author,
                                               @RequestParam(value="page",defaultValue = "0")int page,
                                               @RequestParam(value="size",defaultValue = "20") int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Quote> pageData = service.getQuotesByAuthor(author,pageable);
        return new PagedModel<>(pageData);
    }

    @GetMapping("/category/{category}")
    public PagedModel<Quote> getAllQuotes(@PathVariable String category,@RequestParam(value="page",defaultValue = "0")int page,
                                          @RequestParam(value="size",defaultValue = "20")int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Quote> categoryData = service.getAllQuotesByCategory(category,pageable);
        return new PagedModel<>(categoryData);
    }

    @GetMapping("/popular")
    public PagedModel<Quote> getQuotesByPopularity(@RequestParam(value="page",defaultValue = "0")int page,
                                          @RequestParam(value="size",defaultValue = "20")int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Quote> categoryData = service.getQuotesByPopularity(pageable);
        return new PagedModel<>(categoryData);
    }

    @GetMapping("/random")
    public Quote getRandomQuote(){
        return service.getRandomQuote();
    }

    @GetMapping("/tags")
    public PagedModel<Quote> getQuotesByPopularity(@RequestParam List<String> tags, @RequestParam(value="page",defaultValue = "0")int page,
                                                   @RequestParam(value="size",defaultValue = "20")int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Quote> categoryData = service.getQuotesByTag(tags,pageable);
        return new PagedModel<>(categoryData);
    }
}
