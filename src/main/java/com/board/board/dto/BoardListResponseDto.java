package com.board.board.dto;

import com.board.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardListResponseDto {
    private String title;

    public BoardListResponseDto(Board board) {
        this.title = board.getTitle();
    }
}
