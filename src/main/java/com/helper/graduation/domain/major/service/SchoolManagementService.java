package com.helper.graduation.domain.major.service;

import com.helper.graduation.domain.major.dto.schoolmanagementservice.AddSchoolRequestDto;
import com.helper.graduation.domain.major.dto.schoolmanagementservice.DeleteSchoolRequestDto;
import com.helper.graduation.domain.major.dto.schoolmanagementservice.SchoolResponseDto;
import com.helper.graduation.domain.major.dto.schoolmanagementservice.UpdateSchoolRequestDto;

public interface SchoolManagementService {

    SchoolResponseDto addSchool(AddSchoolRequestDto request);

    SchoolResponseDto updateSchool(UpdateSchoolRequestDto request);

    Long deleteSchool(DeleteSchoolRequestDto request);

}
