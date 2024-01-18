package com.helper.graduation.domain.member.dto.lecturetakenservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class UpdateLectureTakenRequestDto {

    private Long lectureTakenId;

    private Boolean isSubstitute;

    private Long substituteId;

}
