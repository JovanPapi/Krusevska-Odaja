package com.krusevskaodaja.model.UtilDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogInDTO {
    @NotBlank
    private String usernameOrEmail;
    @NotBlank
    private String password;
}
