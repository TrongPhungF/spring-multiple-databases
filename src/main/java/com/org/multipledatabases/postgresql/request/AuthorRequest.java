package com.org.multipledatabases.postgresql.request;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorRequest {
    private Long id;
    private String username;
    private LocalDate birthDay;
}
