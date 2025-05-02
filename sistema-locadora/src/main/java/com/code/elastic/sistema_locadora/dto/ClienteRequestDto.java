package com.code.elastic.sistema_locadora.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDto(@NotBlank String nome, @Email @NotBlank String email) {
}
