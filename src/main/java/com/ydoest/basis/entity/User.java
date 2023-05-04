package com.ydoest.basis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private Long id;

    private String username;
    private Integer age;
}
