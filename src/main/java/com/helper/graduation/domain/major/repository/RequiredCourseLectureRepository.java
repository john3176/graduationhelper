package com.helper.graduation.domain.major.repository;

import com.helper.graduation.domain.major.domain.RequiredCourseLecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequiredCourseLectureRepository extends JpaRepository<RequiredCourseLecture, Long> {

}
