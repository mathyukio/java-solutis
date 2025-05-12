package school.sptech.lista_to_do.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import school.sptech.lista_to_do.entity.Tarefa;
import school.sptech.lista_to_do.service.TarefaService;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class TarefaControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private TarefaService tarefaService;

    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("Deve retornar 200 e a lista de tarefas")
    void deveListarTarefasComSucesso() throws Exception {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Tarefa 1");
        tarefa.setDescricao("Descrição de teste");
        tarefaService.cadastrar(tarefa);

        mockMvc.perform(MockMvcRequestBuilders.get("/tarefas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].titulo").value("Tarefa 1"))
                .andExpect(jsonPath("$[0].descricao").value("Descrição de teste"));
    }

    @Test
    @DisplayName("Deve retornar 204 quando não houver tarefas")
    void deveRetornar204QuandoNaoHouverTarefas() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tarefas"))
                .andExpect(status().isNoContent());
    }

    @Test
    @DisplayName("Deve retornar 201 ao cadastrar uma tarefa com sucesso")
    void deveCadastrarTarefaComSucesso() throws Exception {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Tarefa 1");
        tarefa.setDescricao("Descrição de teste");

        mockMvc.perform(MockMvcRequestBuilders.post("/tarefas")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(tarefa)))
                .andExpect(status().isCreated())
                .andExpect(result -> {
                    String response = result.getResponse().getContentAsString();
                    assertTrue(response.contains("Tarefa adicionada: Tarefa 1"));
                });
    }

    @Test
    @DisplayName("Deve retornar 200 ao remover uma tarefa existente")
    void deveRemoverTarefaComSucesso() throws Exception {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Tarefa para Remover");
        tarefa.setDescricao("Descrição");

        tarefaService.cadastrar(tarefa);

        mockMvc.perform(MockMvcRequestBuilders
                        .delete("/tarefas/{nome}", "Tarefa para Remover"))
                .andExpect(status().isOk())
                .andExpect(result -> {
                    String response = result.getResponse().getContentAsString();
                    assertTrue(response.contains("Tarefa removida: Tarefa para Remover"));
                });
    }

    @Test
    @DisplayName("Deve retornar 404 ao tentar remover tarefa inexistente")
    void deveFalharAoRemoverTarefaInexistente() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .delete("/tarefas/{nome}", "Inexistente"))
                .andExpect(status().isNotFound());
    }
}