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
@Document(collection = "items")
public class Stage {

    @Id
    private Long id;
    private String name;
    private Boolean isActive;
    private Double stageBudget;

    private Project project;
    private String  supervisor; // to implement after User service
    private List<Requisition> requisitions;
    private Status status = Status.ACTIVE;

}
