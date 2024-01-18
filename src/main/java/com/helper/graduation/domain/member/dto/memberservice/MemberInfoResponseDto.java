package com.helper.graduation.domain.member.dto.memberservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class MemberInfoResponseDto {

    private Long id;
    private String username;
    private String name;

}
