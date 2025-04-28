package elasticcode.solutis.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRO_ELETRONICO")
public class Eletronico extends Livro{
    private Integer tamanho;

    public Eletronico(String titulo, String autor, String editora, Float preco, Integer tamanho) {
        super(titulo, autor, editora, preco);
        this.tamanho = tamanho;
    }

    public Eletronico() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("========= Eletrônico =========\n");
        sb.append("Título:   ").append(getTitulo()).append("\n");
        sb.append("Autor:    ").append(getAutor()).append("\n");
        sb.append("Editora:  ").append(getEditora()).append("\n");
        sb.append("Preço:    ").append(String.format("R$ %.2f", getPreco())).append("\n");
        sb.append("Tamanho:  ").append(tamanho).append("\n");
        sb.append("===============================");
        return sb.toString();
    }
}
