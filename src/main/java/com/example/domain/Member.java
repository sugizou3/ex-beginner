package com.example.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private Integer depId;
}
