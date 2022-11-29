package com.example.house_cleaning_service_company.order.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class OrderType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_typeOfService")
    private Long typeOfServiceId;

    @Column(name = "fk_employer")
    private Long employerId;

    private Long SumOfAmount;

    @Temporal(TemporalType.TIME)
    private Date timeOfOrder;

    @Temporal(TemporalType.DATE)
    private Date dateOfOrder;

    @Temporal(TemporalType.TIME)
    private Date timeDelivery;

    @Temporal(TemporalType.DATE)
    private Date dateDelivery;

}