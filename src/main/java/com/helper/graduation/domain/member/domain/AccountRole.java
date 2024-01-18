package com.helper.graduation.domain.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AccountRole {
    ADMIN("ROLE_ADMIN", "ADMIN"),
    MANAGER("ROLE_MANAGER", "MANAGER"),
    USER("ROLE_USER", "USER");

    private String key;
    private String name;
}
