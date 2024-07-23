package com.example.board_crud.crud.repository;

import com.example.board_crud.crud.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    //List<BoardListResponseDto> findALlByOrderByModifiedAtDesc();
}
