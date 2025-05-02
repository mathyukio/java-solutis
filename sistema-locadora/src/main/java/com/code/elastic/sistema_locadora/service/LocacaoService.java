package com.code.elastic.sistema_locadora.service;

import com.code.elastic.sistema_locadora.exception.EntidadeNaoEncontradaException;
import com.code.elastic.sistema_locadora.exception.FilmeDevolvidoException;
import com.code.elastic.sistema_locadora.model.Locacao;
import com.code.elastic.sistema_locadora.repository.ClienteRepository;
import com.code.elastic.sistema_locadora.repository.FilmeRepository;
import com.code.elastic.sistema_locadora.repository.LocacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LocacaoService {

    private final LocacaoRepository locacaoRepository;
    private final FilmeRepository filmeRepository;
    private final ClienteRepository clienteRepository;

    public Locacao alugar(Locacao locacao, Long idCliente, Long idFilme) {
        var cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Cliente não encontrado"));

        var filme = filmeRepository.findById(idFilme)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Filme não encontrado"));

        boolean filmeAlugado = locacaoRepository.existsByFilmeAndDevolvidoFalse(filme);
        if (filmeAlugado) {
            throw new RuntimeException("Filme já está alugado");
        }

        locacao.setCliente(cliente);
        locacao.setFilme(filme);
        locacao.setDevolvido(false);

        return locacaoRepository.save(locacao);
    }

    public List<Locacao> listar() {
        return locacaoRepository.findAll();
    }

    public Locacao devolver(Long id) {
        Locacao locacao = locacaoRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Locação não encontrada"));

        if (locacao.isDevolvido()) {
            throw new FilmeDevolvidoException("Filme já foi devolvido");
        }

        locacao.setDevolvido(true);
        locacao.setDataDevolucao(LocalDate.now());

        return locacaoRepository.save(locacao);
    }
}
