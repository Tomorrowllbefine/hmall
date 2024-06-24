package com.hmall.user.domain.vo;

import lombok.Data;

@Data
public class UserLoginVO {
    private String token; // jwt的token
    private Long userId;
    private String username;
    private Integer balance;
}
