package com.example.house_cleaning_service_company.Base.domain;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseDomain {
    @Id
    private Long id;
}
