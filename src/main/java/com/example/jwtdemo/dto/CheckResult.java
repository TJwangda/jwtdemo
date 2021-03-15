package com.example.jwtdemo.dto;

import io.jsonwebtoken.Claims;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CheckResult {
    private boolean success;
    private Claims claims;
    private String errCode;
}

