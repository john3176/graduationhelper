package com.helper.graduation.domain.member.repository;

import com.helper.graduation.domain.member.domain.LectureTaken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureTakenRepository extends JpaRepository<LectureTaken, Long> {



}
