package com.example.house_cleaning_service_company.employer.dao;

import com.example.house_cleaning_service_company.employer.domain.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Long> {

}
