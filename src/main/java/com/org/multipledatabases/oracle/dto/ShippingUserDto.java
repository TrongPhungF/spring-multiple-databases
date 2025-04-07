package com.org.multipledatabases.oracle.dto;

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
public class ShippingUserDto {
    private Long id;
    private String userName;
    private LocalDate birthDay;
}
