package com.example.board_crud.crud.service;

import com.example.board_crud.crud.Dto.BoardListResponseDto;
import com.example.board_crud.crud.Dto.BoardRequestDto;
import com.example.board_crud.crud.Dto.BoardResponseDto;
import com.example.board_crud.crud.entity.Board;
import com.example.board_crud.crud.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    //글 생성
    public BoardResponseDto createBoard(BoardRequestDto requestDto){
        Board board = new Board(requestDto);
        boardRepository.save(board);
        return new BoardResponseDto(board);
    }
    //모든 글 가져오기
    public List<BoardListResponseDto> findAllBoard(){
        try{
            List<Board> boardList = boardRepository.findAll();
            List<BoardListResponseDto> responseDtoList = new ArrayList<>();
            for (Board board : boardList){
                responseDtoList.add(
                        new BoardListResponseDto(board)
                );
            }
            return responseDtoList;
        }catch (Exception e){
            //throw new DBEmptyDataException("a");
        }
        return null;
    }
    //글 하나 가져오기
    public BoardResponseDto findOneBoard(Long id){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("조회 실패")
        );
        return new BoardResponseDto(board);
    }
    //글 수정
    @Transactional
    public BoardResponseDto updateBoard(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return new BoardResponseDto(board);
    }
    //삭제
    @Transactional
    public Long deleteBoard(Long id){
        boardRepository.deleteById(id);
        return id;
    }
    //비밀번호 일치 확인
    public boolean checkPassword(Long id, String inputPassword){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        if(inputPassword.equals(board.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
