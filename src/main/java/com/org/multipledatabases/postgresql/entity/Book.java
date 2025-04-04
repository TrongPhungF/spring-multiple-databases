package com.org.multipledatabases.postgresql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    private Long id;
    private String bookName;
}
