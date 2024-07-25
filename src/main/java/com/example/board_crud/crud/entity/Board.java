package com.example.board_crud.crud.entity;
import com.example.board_crud.crud.Dto.BoardUpdateRequestDto;
import com.example.board_crud.crud.Dto.BoardWriteRequestDto;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity(name = "boards")
@Getter
public class Board {
    //글 고유 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //글 제목
    private String title;
    //글 내용
    private String content;
    //비밀번호
    private String password;

    //생성 메소드
    public Board(BoardWriteRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
     }
    //업데이트 메소드
    public void update(BoardUpdateRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }
}