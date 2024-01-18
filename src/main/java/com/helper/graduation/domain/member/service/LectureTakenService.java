package com.helper.graduation.domain.member.service;

import com.helper.graduation.domain.member.dto.lecturetakenservice.*;

import java.util.List;

public interface LectureTakenService {

    LectureTakenResponseDto addLectureTaken(AddLectureTakenRequestDto request);

    List<LectureTakenResponseDto> getAllLectureTaken(GetAllLectureTakenRequestDto request);

    LectureTakenResponseDto editLectureTaken(UpdateLectureTakenRequestDto request);

    Long deleteLectureTaken(DeleteLectureTakenRequestDto request);

}
