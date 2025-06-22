package io.rougesocket.GoodQuotes.controller;

import io.rougesocket.GoodQuotes.model.Quote;
import io.rougesocket.GoodQuotes.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotes")
public class QuotesController {
    @Autowired
    private QuotesService service;

    @GetMapping("/{id}")
    public Quote getQuote(@PathVariable String id){
        return service.getQuoteById(id).orElseThrow();
    }
}
