package com.example.house_cleaning_service_company.employer.service;

import com.example.house_cleaning_service_company.employer.dao.EmployerDao;
import com.example.house_cleaning_service_company.employer.domain.Employer;
import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployerService {

    @Autowired
    private EmployerDao employerDao;


    public void save(EmployerModel employerModel) {
        employerDao.save(convertModelToDomain(employerModel));
    }

    private Employer convertModelToDomain(EmployerModel employerModel) {
        Employer employer = new Employer();
        employer.setNumber(employerModel.getNumber());
        employer.setFirstName(employerModel.getFirstName());
        employer.setLastName(employerModel.getLastName());
        employer.setPassword(employerModel.getPassword());
        employer.setUsername(employerModel.getUsername());

        return employer;
    }


}
