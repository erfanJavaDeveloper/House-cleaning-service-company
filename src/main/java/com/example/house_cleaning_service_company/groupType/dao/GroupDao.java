package com.example.house_cleaning_service_company.groupType.dao;

import com.example.house_cleaning_service_company.groupType.domain.GroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GroupDao extends JpaRepository<GroupType,Long> {

    @Modifying
    @Query
    void update(Long code, String title, Long id);
}
