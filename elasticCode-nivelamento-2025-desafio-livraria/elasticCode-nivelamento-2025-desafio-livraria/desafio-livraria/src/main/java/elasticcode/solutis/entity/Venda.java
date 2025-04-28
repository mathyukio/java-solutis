package elasticcode.solutis.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;

    private static Integer numVendas = 0;
    private String nomeCliente;
    private Double valor = 0.0;

    @ManyToMany
    private List<Livro> livros = new ArrayList<>();


    public Venda(String nomeCliente, Double valor) {
        this.numero = numVendas;
        numVendas++;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public Venda() {
    }

    public void addLivro(Livro l) {
        if (l != null) {
            livros.add(l);
            valor += l.getPreco();
        } else {
            System.out.println("Livro inválido.");
        }
    }


    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado na venda.");
        } else {
            for (Livro l : livros) {
                System.out.println("\nLivro: " + l.toString());
            }
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public static Integer getNumVendas() {
        return numVendas;
    }

    public static void setNumVendas(Integer numVendas) {
        Venda.numVendas = numVendas;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValor() {
        Double total = 0.0;
        for (Livro livro : livros) {
            total += livro.getPreco();
        }
        return total;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("========== Venda ==========\n");
        sb.append("Número:        ").append(numero).append("\n");
        sb.append("Cliente:       ").append(nomeCliente).append("\n");
        sb.append("Valor Total:   R$ ").append(String.format("%.2f", valor)).append("\n");
        sb.append("Livros:\n");

        for (Livro l : livros) {
            sb.append(" - ").append(l.getTitulo()).append("\n");
        }

        sb.append("============================\n");
        return sb.toString();
    }

}
