package com.code.elastic.sistema_locadora.dto;

import jakarta.validation.constraints.NotBlank;

public record FilmeRequestDto(@NotBlank String titulo, @NotBlank String genero, @NotBlank String diretor) {
}
