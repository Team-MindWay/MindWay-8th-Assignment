package com.example.board_crud.crud.controller;

import com.example.board_crud.crud.Dto.BoardListResponseDto;
import com.example.board_crud.crud.Dto.BoardRequestDto;
import com.example.board_crud.crud.Dto.BoardResponseDto;
import com.example.board_crud.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    //글 등록
    @PostMapping
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto){
        BoardResponseDto board = boardService.createBoard(requestDto);
        return board;
    }
    //전체 목록 조회
    @GetMapping
    public List<BoardListResponseDto> getAllBoards(){
        return boardService.findAllBoard();
    }
    //글 하나 조회
    @GetMapping("/{id}")
    public BoardResponseDto getOneBoard(@PathVariable Long id){
        return boardService.findOneBoard(id);
    }
    //글 수정
    @PutMapping("/{id}")
    public BoardResponseDto updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }
    //글 삭제
    @DeleteMapping("/{id}")
    public Long deleteBoard(@PathVariable Long id){
        return boardService.deleteBoard(id);
    }
    //비밀번호 확인
    @GetMapping("/check/{id}/{inputPassword}")
    public boolean checkPassword(@PathVariable Long id,@PathVariable String inputPassword){
        return boardService.checkPassword(id, inputPassword);
    }
}
