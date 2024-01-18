package com.helper.graduation.domain.major.repository;

import com.helper.graduation.domain.major.domain.CoreCourseCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreCourseCreditRepository extends JpaRepository<CoreCourseCredit, Long> {

}
