package com.helper.graduation.domain.member.dto.lecturetakenservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class AddLectureTakenRequestDto {

    private Long lectureId;

    private Long substituteId;

}
