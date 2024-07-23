package com.board.board.dto;

import com.board.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardResponseDto {
    private String title;
    private String content;

    public BoardResponseDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
