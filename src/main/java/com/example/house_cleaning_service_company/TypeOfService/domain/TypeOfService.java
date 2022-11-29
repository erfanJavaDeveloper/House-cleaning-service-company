package com.example.house_cleaning_service_company.TypeOfService.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class TypeOfService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ServiceName;

    private String description;

    @Column(name = "fk_group")
    private Long groupId;

}
