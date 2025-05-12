package school.sptech.lista_to_do.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TarefaRequestDto(@NotNull @Size(min = 1) String titulo, @NotNull @Size(min = 1) String descricao) {
}
