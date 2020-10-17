package com.ogmatech.springbootmangodbapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Customer {
    @Id
    private String _id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long mobileNumber;
    private String emailId;
}
