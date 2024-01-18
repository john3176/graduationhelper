package com.helper.graduation.domain.member.dto.authservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class LoginResponseDto {

    private Long memberId;

    private String name;

    private String username;


}
