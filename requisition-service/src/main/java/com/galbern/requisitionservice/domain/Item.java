package com.galbern.requisitionservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "items")
@JsonIgnoreProperties({"supplier"})
public class Item {

    @Id
    private Long id;

    private String name;
    private Float quantity;
    private Double price;
    private Requisition requisition;
    private Supplier supplier;

    public Item(Long id, String name, Float v, Double i) {
        this.id = id;
        this.name = name;
        this.quantity = v;
        this.price = i;

    }
}
