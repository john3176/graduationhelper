package com.helper.graduation.domain.major.service;

import com.helper.graduation.domain.major.dto.majormanagementservice.AddMajorRequestDto;
import com.helper.graduation.domain.major.dto.majormanagementservice.DeleteMajorRequestDto;
import com.helper.graduation.domain.major.dto.majormanagementservice.MajorResponseDto;
import com.helper.graduation.domain.major.dto.majormanagementservice.UpdateMajorRequestDto;

public interface MajorManagementService {

    MajorResponseDto addMajor(AddMajorRequestDto request);

    MajorResponseDto updateMajor(UpdateMajorRequestDto request);

    Long deleteMajor(DeleteMajorRequestDto request);

}
