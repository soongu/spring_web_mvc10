package com.spring.webmvc.board.dto;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardWriteDto {

    private String title;
    private String content;
    private String writer;
}
