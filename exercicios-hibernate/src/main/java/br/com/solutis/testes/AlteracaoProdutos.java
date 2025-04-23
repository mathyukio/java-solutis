package br.com.solutis.testes;

import br.com.solutis.repository.ProdutoRepository;

import java.util.Scanner;

public class AlteracaoProdutos {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do produto que deseja alterar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o preço que você deseja alterar: ");
        Double novoPreco = sc.nextDouble();

        repository.atualizarPrecoProduto(id, novoPreco);
        repository.fechar();


    }
}
