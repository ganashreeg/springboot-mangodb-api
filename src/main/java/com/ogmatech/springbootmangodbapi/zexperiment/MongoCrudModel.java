package com.ogmatech.springbootmangodbapi.zexperiment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MongoCrudModel {
    private String _id;
    private String name;
    private Integer age;
}
