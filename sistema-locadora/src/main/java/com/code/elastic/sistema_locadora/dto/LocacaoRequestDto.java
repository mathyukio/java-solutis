package com.code.elastic.sistema_locadora.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record LocacaoRequestDto(Long idCliente, Long idFilme,@PastOrPresent LocalDate dataLocacao) {
}
