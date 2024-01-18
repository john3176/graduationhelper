package com.helper.graduation.domain.major.domain;

import com.helper.graduation.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Major extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long schoolId;

    @Column(nullable = false)
    private Long coreLectureCreditId;

    @Column(nullable = false)
    private Long requiredLectureCreditId;

    @Column(nullable = false)
    private Long selectiveLectureCreditId;

    @Column(nullable = false)
    private Long requiredCredit;

    @Column(nullable = false)
    private Boolean isAllowedForFirstMajor;

    @Column(nullable = false)
    private Boolean isForManagerAccount;

}
