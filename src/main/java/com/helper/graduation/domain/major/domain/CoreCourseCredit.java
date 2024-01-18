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
public class CoreCourseCredit extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long majorId;

    @Column(nullable = false)
    private Long coreCourseTypeId;

    @Column(nullable = false)
    private Long credit;

}
