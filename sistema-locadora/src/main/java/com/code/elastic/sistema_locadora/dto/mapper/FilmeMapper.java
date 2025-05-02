package com.code.elastic.sistema_locadora.dto.mapper;

import com.code.elastic.sistema_locadora.dto.FilmeRequestDto;
import com.code.elastic.sistema_locadora.dto.FilmeResponseDto;
import com.code.elastic.sistema_locadora.model.Filme;

public class FilmeMapper {

    public static Filme toEntity(FilmeRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }

        Filme filme = new Filme();
        filme.setTitulo(requestDto.titulo());
        filme.setGenero(requestDto.genero());
        filme.setDiretor(requestDto.diretor());

        return filme;
    }

    public static FilmeResponseDto toDto(Filme filme) {
        if (filme == null) {
            return null;
        }

        FilmeResponseDto responseDto = new FilmeResponseDto(
                filme.getId(),
                filme.getTitulo(),
                filme.getGenero()
        );

        return responseDto;
    }
}
