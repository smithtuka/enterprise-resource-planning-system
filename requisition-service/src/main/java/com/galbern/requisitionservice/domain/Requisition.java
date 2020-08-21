package com.galbern.requisitionservice.domain;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
@Data
@NoArgsConstructor
@Document(collection = "requisitions")
public class Requisition {
    @Id
    private Long id;
    private LocalDate requisitionDate;
    private LocalDate requiredDate;
    private String requester; // to User service after
    private Stage stage;
    private List<Item> items;
    private Status status = Status.PENDING;
}
