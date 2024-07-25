package com.example.board_crud.crud.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardWriteRequestDto {
    private String title;
    private String content;
    private String password;
}
