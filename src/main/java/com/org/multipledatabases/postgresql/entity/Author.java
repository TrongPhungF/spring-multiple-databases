package com.org.multipledatabases.postgresql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Author {

    @Id
    private Long id;
    private String username;
    private LocalDate birthDay;
}
