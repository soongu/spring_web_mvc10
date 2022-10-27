package com.spring.webmvc.board.domain;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void builderTest() {

        Board board = new Board.Builder()
                        .title("제목이지롱")
                        .boardNo(20L)
                        .content("g하하하히호호")
                        .writer("즐~~~")
                        .build();




    }

}