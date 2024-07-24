package com.example.board_crud.crud.Dto;


import com.example.board_crud.crud.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardResponseDto {
    private String title;
    private String content;

    public BoardResponseDto(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
