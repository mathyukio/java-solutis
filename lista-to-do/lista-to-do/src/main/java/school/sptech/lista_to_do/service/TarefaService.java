package school.sptech.lista_to_do.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import school.sptech.lista_to_do.entity.Tarefa;
import school.sptech.lista_to_do.exception.EntidadeNaoEncontradaException;
import school.sptech.lista_to_do.repository.TarefaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefaService{

    private final TarefaRepository repository;

    public Tarefa cadastrar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public void removerPorNome(String titulo) {
        Tarefa tarefa = repository.findByTitulo(titulo)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Task com nome '%s' não encontrada.".formatted(titulo)));

        repository.delete(tarefa);
    }
}
