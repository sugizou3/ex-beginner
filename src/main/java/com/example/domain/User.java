package com.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class User {
    private String name;
    private Integer age;
    private String comment;
}
