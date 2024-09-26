package com.example.sonar_demo.dto;

import lombok.Data;

@Data
public class EmployeeReqDto {
    private String name;
    private String email;
    private Boolean status;
}
