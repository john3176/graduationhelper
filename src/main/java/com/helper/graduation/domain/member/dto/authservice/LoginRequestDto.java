package com.helper.graduation.domain.member.dto.authservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class LoginRequestDto {

    private String username;
    private String password;

}
