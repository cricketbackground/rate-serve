package com.serve.json.jsonserver.conroller;

import com.serve.json.jsonserver.model.Department;
import com.serve.json.jsonserver.model.Employee;
import com.serve.json.jsonserver.model.Location;
import com.serve.json.jsonserver.model.Organization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "department")
public class EmptyRestController {
    @GetMapping
    public ResponseEntity<?> doSomething() {
        Employee employee1 = new Employee();
        employee1.setFirstName("Deepak");
        employee1.setLastName("Jalota");

        Employee employee2 = new Employee();
        employee2.setFirstName("Anup");
        employee2.setLastName("Kheer");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        Department department = new Department();
        department.setEmployees(employees);
        department.setName("science");

        Location location = new Location();
        location.setCity("Bangalore");
        location.setState("Karnataka");

        department.setLocation(location);

        Organization organization = new Organization();
        organization.setName("Search Company");
        organization.setDepartment(department);

        return ResponseEntity.ok(organization);
    }
}