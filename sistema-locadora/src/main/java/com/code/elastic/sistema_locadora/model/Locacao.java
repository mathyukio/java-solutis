package com.code.elastic.sistema_locadora.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PastOrPresent
    private LocalDate dataLocacao;

    @FutureOrPresent
    private LocalDate dataDevolucao;
    private boolean devolvido;

    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Filme filme;
}
