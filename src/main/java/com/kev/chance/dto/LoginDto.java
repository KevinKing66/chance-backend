package com.kev.chance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Data
@NoArgsConstructor
public class LoginDto {
    private String email;
    private String password;
}
