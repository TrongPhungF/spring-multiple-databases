package com.org.multipledatabases.mysql.dto;

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
public class UserDto {

    @Id
    private Long userId;
    private String username;
    private LocalDate birthDay;
}
