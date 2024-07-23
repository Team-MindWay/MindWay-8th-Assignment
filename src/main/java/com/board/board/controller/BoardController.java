package com.board.board.controller;

import com.board.board.dto.BoardListResponseDto;
import com.board.board.dto.BoardRequestDto;
import com.board.board.dto.BoardResponseDto;
import com.board.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")  // 모든 엔드포인트에 기본 경로 추가
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/")
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto) {
        return boardService.createBoard(requestDto);
    }

    @GetMapping("/")
    public List<BoardListResponseDto> getAllBoards() {
        return boardService.findAllBoard();
    }

    @GetMapping("/{id}")
    public BoardResponseDto getOneBoard(@PathVariable Long id) {
        return boardService.findOneBoard(id);
    }

    @PutMapping("/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public Long deleteBoard(@PathVariable Long id) {
        return boardService.deleteBoard(id);
    }

    @GetMapping("/check/{id}/{inputPassword}")
    public boolean checkPassword(@PathVariable Long id, @PathVariable String inputPassword) {
        return boardService.checkPassword(id, inputPassword);
    }
}
