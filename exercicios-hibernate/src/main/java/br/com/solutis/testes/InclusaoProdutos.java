package br.com.solutis.testes;

import br.com.solutis.modelo.Produto;
import br.com.solutis.repository.ProdutoRepository;

public class InclusaoProdutos {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();
        Produto produto = new Produto("Panela",
                "Panela de Pressão 10L", 56.80);
        repository.salvar(produto);
        Produto produto2 = new Produto("Cama",
                "Cama de Casal Big", 450.68);
        repository.salvar(produto2);
        Produto produto3 = new Produto("Caixa de Som",
                "Caixa de Som JBL", 160.00);
        repository.salvar(produto3);

        repository.fechar();
    }

}
