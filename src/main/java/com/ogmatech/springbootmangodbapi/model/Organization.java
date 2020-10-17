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
public class Organization {
    @Id
    private String _id;
    private String organizationName;
    private String organizationCode;
    private Boolean isActive;
    private Boolean isDeleted;
}
