package com.org.multipledatabases.postgresql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto {

    private Long id;
    private String username;
    private LocalDate birthDay;
}
