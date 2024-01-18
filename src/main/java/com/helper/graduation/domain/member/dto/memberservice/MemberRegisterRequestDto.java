package com.helper.graduation.domain.member.dto.memberservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class MemberRegisterRequestDto {

    private String username;
    private String name;
    private String password;
}
