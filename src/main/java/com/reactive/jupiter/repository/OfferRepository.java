package com.reactive.jupiter.repository;

import com.reactive.jupiter.model.Offer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface OfferRepository extends ReactiveMongoRepository<Offer, String> {
    Flux<Offer> findByName(String name);
}