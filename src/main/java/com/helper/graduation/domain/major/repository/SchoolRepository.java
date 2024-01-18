package com.helper.graduation.domain.major.repository;

import com.helper.graduation.domain.major.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {


}
