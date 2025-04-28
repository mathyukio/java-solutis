package elasticcode.solutis.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRO_IMPRESSO")
public class Impresso extends Livro{
    private Float frete; // frete cobrado para entrega do livro
    private Integer estoque;

    public Impresso(String titulo, String autor, String editora, Float preco, Float frete, Integer estoque) {
        super(titulo, autor, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    public Impresso(){
        super();
    }

    public void atualizarEstoque(){
        if (estoque > 0) {
            this.estoque--;
        } else {
            System.out.println("Estoque insuficiente para o livro: " + getTitulo());
        }
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Float getFrete() {
        return frete;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("========== Impresso ==========\n");
        sb.append("Título:  ").append(super.getTitulo()).append("\n");
        sb.append("Autor:   ").append(super.getAutor()).append("\n");
        sb.append("Editora: ").append(super.getEditora()).append("\n");
        sb.append("Preço:   ").append(String.format("R$ %.2f", super.getPreco())).append("\n");
        sb.append("Frete:   ").append(String.format("R$ %.2f", frete)).append("\n");
        sb.append("Estoque: ").append(estoque).append("\n");
        sb.append("===============================");
        return sb.toString();
    }
}
