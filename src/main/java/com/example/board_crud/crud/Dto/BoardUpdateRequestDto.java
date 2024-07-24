package com.example.board_crud.crud.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardUpdateRequestDto {
    private String title;
    private String content;
    private String password;
}
