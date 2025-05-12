package school.sptech.lista_to_do.dto.mapper;

import school.sptech.lista_to_do.dto.TarefaRequestDto;
import school.sptech.lista_to_do.dto.TarefaResponseDto;
import school.sptech.lista_to_do.entity.Tarefa;

public class TarefaMapper {

    public static Tarefa toEntity (TarefaRequestDto dto) {

        if (dto == null){
            return null;
        }

        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());

        return tarefa;
    }

    public static TarefaResponseDto toDto (Tarefa tarefa) {
        if (tarefa == null){
            return null;
        }

        TarefaResponseDto responseDto = new TarefaResponseDto(
                tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getDescricao()
        );

        return responseDto;
    }
}
