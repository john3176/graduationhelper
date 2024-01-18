package com.helper.graduation.domain.member.dto.memberservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class UpdateMemberInfoRequestDto {

    private Long memberId;

    private String name;

    private Boolean isPasswordChange;

    private String password;

}
