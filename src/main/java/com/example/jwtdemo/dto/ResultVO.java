package com.example.jwtdemo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
