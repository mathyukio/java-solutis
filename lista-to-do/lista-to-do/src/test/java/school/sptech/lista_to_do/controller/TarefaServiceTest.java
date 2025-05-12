package school.sptech.lista_to_do.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import school.sptech.lista_to_do.entity.Tarefa;
import school.sptech.lista_to_do.exception.EntidadeNaoEncontradaException;
import school.sptech.lista_to_do.repository.TarefaRepository;
import school.sptech.lista_to_do.service.TarefaService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TarefaServiceTest {

    @Mock
    private TarefaRepository tarefaRepository;

    @InjectMocks
    private TarefaService tarefaService;

    private Tarefa tarefa;

    @BeforeEach
    void setUp() {
        tarefa = new Tarefa(1l, "Tarefa de Teste", "Descrição de Teste");
    }

    @Test
    void deveCadastrarTarefa() {
        when(tarefaRepository.save(any(Tarefa.class))).thenReturn(tarefa);

        Tarefa resultado = tarefaService.cadastrar(tarefa);

        assertNotNull(resultado);
        assertEquals("Tarefa de Teste", resultado.getTitulo());
        verify(tarefaRepository, times(1)).save(tarefa);
    }

    @Test
    void deveListarTarefas() {
        when(tarefaRepository.findAll()).thenReturn(Arrays.asList(tarefa));

        List<Tarefa> resultado = tarefaService.listar();

        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("Tarefa de Teste", resultado.get(0).getTitulo());
        verify(tarefaRepository, times(1)).findAll();
    }

    @Test
    void deveRemoverTarefaPorNome() {
        when(tarefaRepository.findByTitulo("Tarefa de Teste")).thenReturn(Optional.of(tarefa));

        tarefaService.removerPorNome("Tarefa de Teste");

        verify(tarefaRepository, times(1)).findByTitulo("Tarefa de Teste");
        verify(tarefaRepository, times(1)).delete(tarefa);
    }

    @Test
    void deveLancarExcecaoAoRemoverTarefaInexistente() {
        when(tarefaRepository.findByTitulo("Inexistente")).thenReturn(Optional.empty());

        EntidadeNaoEncontradaException ex = assertThrows(
                EntidadeNaoEncontradaException.class,
                () -> tarefaService.removerPorNome("Inexistente")
        );

        assertEquals("Task com nome 'Inexistente' não encontrada.", ex.getMessage());
        verify(tarefaRepository, times(1)).findByTitulo("Inexistente");
        verify(tarefaRepository, never()).delete(any());
    }
}
