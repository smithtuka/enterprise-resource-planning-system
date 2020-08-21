package com.galbern.requisitionservice.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Project project;
}
