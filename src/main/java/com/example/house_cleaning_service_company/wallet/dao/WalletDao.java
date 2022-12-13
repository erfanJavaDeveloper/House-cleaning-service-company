package com.example.house_cleaning_service_company.wallet.dao;

import com.example.house_cleaning_service_company.wallet.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletDao extends JpaRepository<Wallet,Long> {

    @Modifying
    @Query
    Wallet update(Long amount,Long employerId);

}
