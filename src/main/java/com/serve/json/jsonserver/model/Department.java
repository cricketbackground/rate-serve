package com.serve.json.jsonserver.model;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private String name;
    private Location location;
    private List<Employee> employees;
}
