package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class UserRegistrationForm {
    @NotBlank(message = "名前は必須です")
    private String name;
    @NotNull(message = "年齢は必須です")
    @Range(min = 0, max = 200, message = "0~200の間で数値を入力してください")
    private Integer age;
    @Length(min = 1, max = 300, message = "１文字以上３００文字以内で入力してください")
    private String comment;
}
