package com.example.house_cleaning_service_company.score.domain;

import com.example.house_cleaning_service_company.Base.domain.BaseDomain;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_worker")
    private Long workerId;

    @Column(name = "fk_employer")
    private Long employerId;

    private Integer workerScore;

}