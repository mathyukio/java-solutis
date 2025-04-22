package br.com.solutis.exercicioPessoa.mains;

import br.com.solutis.exercicioPessoa.Fornecedor;

public class MainFornecedor {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Matheus",
                "Solutis", "1142139468",
                500.0, 300.0);

        System.out.println("O seu saldo da conta: " + fornecedor.obterSaldo());
    }
}
