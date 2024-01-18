package com.helper.graduation.domain.major.repository;

import com.helper.graduation.domain.major.domain.SelectiveCourseLecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectiveCourseLectureRepository extends JpaRepository<SelectiveCourseLecture, Long> {
}
