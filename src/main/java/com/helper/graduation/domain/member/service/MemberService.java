package com.helper.graduation.domain.member.service;

import com.helper.graduation.domain.member.dto.memberservice.*;

public interface MemberService {

    MemberInfoResponseDto userRegister(MemberRegisterRequestDto request);

    MemberInfoResponseDto managerRegister(MemberRegisterRequestDto request);

    MemberInfoResponseDto adminRegister(MemberRegisterRequestDto request);

    MemberInfoResponseDto getMemberInfo(GetMemberInfoRequestDto request);

    MemberInfoResponseDto updateMemberInfo(UpdateMemberInfoRequestDto request);

    Long deleteMember(DeleteMemberReqeustDto request);

}
