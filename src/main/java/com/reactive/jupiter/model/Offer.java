package com.reactive.jupiter.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Offer {
    @Id
    private String id;
    private String name;
    private String description;
    private Boolean active;
}