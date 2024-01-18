package com.helper.graduation.domain.member.service;

import com.helper.graduation.domain.member.dto.memberregisterservice.MemberRegisterRequestDto;
import com.helper.graduation.domain.member.dto.memberregisterservice.MemberRegisterResponseDto;

public interface MemberRegisterService {

    MemberRegisterResponseDto register(MemberRegisterRequestDto request);

}
