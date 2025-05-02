package com.code.elastic.sistema_locadora.dto;

import java.time.LocalDate;

public record LocacaoResponseDto(Long id, LocalDate dataDevolucao, LocalDate dataLocacao, FilmeResponseDto filme, ClienteResponseDto cliente) {
}
