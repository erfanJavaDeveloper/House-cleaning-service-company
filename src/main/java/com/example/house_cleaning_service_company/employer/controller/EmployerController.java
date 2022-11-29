package com.example.house_cleaning_service_company.employer.controller;

import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import com.example.house_cleaning_service_company.employer.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employer")
public class EmployerController {
    @Autowired
    private EmployerService employerService;


    @PostMapping
    public ResponseEntity<String> save(@RequestBody EmployerModel employerModel){
        employerService.save(employerModel);
        return ResponseEntity.status(HttpStatus.OK)
                .body("saved");
    }
}
