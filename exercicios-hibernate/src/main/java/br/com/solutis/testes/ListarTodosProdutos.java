package br.com.solutis.testes;

import br.com.solutis.modelo.Produto;
import br.com.solutis.repository.ProdutoRepository;

import java.util.List;

public class ListarTodosProdutos {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();


        List<Produto> produtos = repository.listarTodos();

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Nome do Produto: " + produtos.get(i).getNome());
            System.out.println("Descrição do Produto: " + produtos.get(i).getDescricao());
            System.out.println("Preço do Produto: " + produtos.get(i).getPreco());
            System.out.println();
        }

        repository.fechar();
    }
}
