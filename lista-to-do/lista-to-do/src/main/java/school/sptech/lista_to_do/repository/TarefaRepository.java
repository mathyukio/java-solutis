package school.sptech.lista_to_do.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.lista_to_do.entity.Tarefa;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
    Optional<Tarefa> findByTitulo(String nome);
}
