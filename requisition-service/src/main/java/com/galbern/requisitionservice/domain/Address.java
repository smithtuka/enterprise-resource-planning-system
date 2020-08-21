package com.galbern.requisitionservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "addresses")
public class Address {
    // if need arises
}
