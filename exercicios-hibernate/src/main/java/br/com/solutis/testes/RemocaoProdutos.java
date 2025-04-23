package br.com.solutis.testes;

import br.com.solutis.repository.ProdutoRepository;

import java.util.Scanner;

public class RemocaoProdutos {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto que deseja excluir: ");
        int id = sc.nextInt();

        repository.removerProdutoPorId(id);
        repository.fechar();
    }
}
