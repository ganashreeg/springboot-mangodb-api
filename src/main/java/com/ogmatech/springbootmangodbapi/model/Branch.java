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
public class Branch {
    @Id
    private String _id;
    private String branchName;
    private String branchCode;
    private String website;
    private Long primaryPhone;
    private Long secondaryPhone;
    private String email;
    private String gstin;
    private Boolean isActive;
    private Boolean isDeleted;

}
