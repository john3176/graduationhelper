package com.helper.graduation.domain.member.service;

import com.helper.graduation.domain.member.dto.authservice.LoginRequestDto;
import com.helper.graduation.domain.member.dto.authservice.LoginResponseDto;

public interface AuthService {

    LoginResponseDto userLogin(LoginRequestDto request);

    LoginResponseDto managerLogin(LoginRequestDto request);

    LoginResponseDto adminLogin(LoginRequestDto request);

}
