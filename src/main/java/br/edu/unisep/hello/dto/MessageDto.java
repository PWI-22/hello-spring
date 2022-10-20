package br.edu.unisep.hello.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MessageDto {
    private String content;
    private String destination;
}
