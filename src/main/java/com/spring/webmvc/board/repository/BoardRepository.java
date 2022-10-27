package com.spring.webmvc.board.repository;

import com.spring.webmvc.board.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// SQL Mapper 인터페이스
@Mapper
public interface BoardRepository {

    // 게시글 목록 조회
    List<Board> findAll();

    // 게시글 상세 단일 조회
    Board findOne(Long boardNo);

    // 게시글 쓰기
    boolean save(Board board);

    // 게시글 삭제
    boolean remove(Long boardNo);

    // 게시글 수정
    boolean modify(Board board);
}
