package school.sptech.lista_to_do.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.lista_to_do.dto.TarefaRequestDto;
import school.sptech.lista_to_do.dto.TarefaResponseDto;
import school.sptech.lista_to_do.dto.mapper.TarefaMapper;
import school.sptech.lista_to_do.entity.Tarefa;
import school.sptech.lista_to_do.service.TarefaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    @GetMapping
    public ResponseEntity<List<TarefaResponseDto>> listar(){
        List<Tarefa> tarefas = service.listar();

        List<TarefaResponseDto> resposta = tarefas.stream().map(TarefaMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<String> cadastrar(@Valid @RequestBody TarefaRequestDto dto) {
        Tarefa task = TarefaMapper.toEntity(dto);
        Tarefa taskSalvo = service.cadastrar(task);

        TarefaResponseDto resposta = TarefaMapper.toDto(taskSalvo);
        System.out.println("Tarefa adicionada: " + resposta);
        return ResponseEntity.status(201).body("Tarefa adicionada: " + resposta.titulo());
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<String> removerPorNome(@PathVariable String nome) {
        service.removerPorNome(nome);
        return ResponseEntity.status(200).body("Tarefa removida: " + nome);
    }
}
