package com.reactive.jupiter.controller;

import com.reactive.jupiter.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reactive.jupiter.model.Offer;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    private OfferRepository offerRepository;
    
    public Flux<Offer> getAll() {
        return offerRepository.findAll();
    }
}