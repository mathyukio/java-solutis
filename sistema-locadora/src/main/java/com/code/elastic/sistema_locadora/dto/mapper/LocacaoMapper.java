package com.code.elastic.sistema_locadora.dto.mapper;

import com.code.elastic.sistema_locadora.dto.ClienteResponseDto;
import com.code.elastic.sistema_locadora.dto.FilmeResponseDto;
import com.code.elastic.sistema_locadora.dto.LocacaoRequestDto;
import com.code.elastic.sistema_locadora.dto.LocacaoResponseDto;
import com.code.elastic.sistema_locadora.model.Locacao;

public class LocacaoMapper {

    public static Locacao toEntity(LocacaoRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }

        Locacao locacao = new Locacao();
        locacao.setDataLocacao(requestDto.dataLocacao());

        return locacao;
    }

    public static LocacaoResponseDto toDto(Locacao locacao) {
        if (locacao == null) {
            return null;
        }

        FilmeResponseDto filme = new FilmeResponseDto(
                locacao.getFilme().getId(),
                locacao.getFilme().getTitulo(),
                locacao.getFilme().getGenero());

        ClienteResponseDto cliente = new ClienteResponseDto(
                locacao.getCliente().getId(),
                locacao.getCliente().getNome()
        );

        LocacaoResponseDto responseDto = new LocacaoResponseDto(
                locacao.getId(),
                locacao.getDataDevolucao(),
                locacao.getDataLocacao(),
                filme,
                cliente
        );

        return responseDto;
    }
}
