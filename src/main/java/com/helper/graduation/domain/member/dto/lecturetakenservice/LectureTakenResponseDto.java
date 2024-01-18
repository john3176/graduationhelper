package com.helper.graduation.domain.member.dto.lecturetakenservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class LectureTakenResponseDto {

    private Long lectureId;

    private String lectureNumber;

    private String lectureName;

    private Long credit;

    private Boolean isSubstitute;

    private Long originalLectureId;

    private String originalLectureName;

    private String originalLectureNumber;

    private Long originalLectureCredit;

}
