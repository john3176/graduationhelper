package com.helper.graduation.domain.major.repository;

import com.helper.graduation.domain.major.domain.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {

}
