package com.galbern.requisitionservice.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@NoArgsConstructor
@Document(collection = "suppliers")
public class Supplier {
    @Id
    private Long id;
    private String name;
    List<Item> items;
}
