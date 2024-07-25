package com.example.board_crud.crud.controller;

import com.example.board_crud.crud.Dto.BoardListResponseDto;
import com.example.board_crud.crud.Dto.BoardUpdateRequestDto;
import com.example.board_crud.crud.Dto.BoardWriteRequestDto;
import com.example.board_crud.crud.Dto.BoardResponseDto;
import com.example.board_crud.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    //글 등록
    @PostMapping
    public ResponseEntity<BoardResponseDto> createBoard(@RequestBody BoardWriteRequestDto requestDto){
        BoardResponseDto board = boardService.createBoard(requestDto);
        return new ResponseEntity<>(board, HttpStatus.CREATED);
    }
    //전체 목록 조회
    @GetMapping
    public ResponseEntity<List<BoardListResponseDto>> getAllBoards(){
        List<BoardListResponseDto> boardList = boardService.findAllBoard();
        return new ResponseEntity<>(boardList, HttpStatus.OK);
    }
    //글 하나 조회
    @GetMapping("/{id}")
    public ResponseEntity<BoardResponseDto> getOneBoard(@PathVariable Long id){
        BoardResponseDto board = boardService.findOneBoard(id);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }
    //글 수정
    @PutMapping("/{id}")
    public ResponseEntity<BoardResponseDto> updateBoard(@PathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto) {
        BoardResponseDto board = boardService.updateBoard(id, requestDto);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }
    //글 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteBoard(@PathVariable Long id){
        Long deleted = boardService.deleteBoard(id);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
    //비밀번호 확인
    @GetMapping("/check/{id}/{inputPassword}")
    public ResponseEntity<Boolean> checkPassword(@PathVariable Long id,@PathVariable String inputPassword){
        boolean isPasswordCorrect = boardService.checkPassword(id, inputPassword);
        return new ResponseEntity<>(isPasswordCorrect, HttpStatus.OK);
    }
}
