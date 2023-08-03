package com.kev.chance.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin
 */
@Data
@NoArgsConstructor
public class LoginDto {

    @NotEmpty(message = "El campo de correo electrónico es obligatorio")
    private String email;

    @NotEmpty(message = "El campo de contraseña es obligatorio")
    private String password;
}
