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
@Document(collection = "projects")
public class Project {

    @Id
    private Long id;
    private String name;
    private Customer customer;
    private List<Stage> stages;
    private String projectManager; // re visit
    private Status status = Status.ACTIVE;
}
