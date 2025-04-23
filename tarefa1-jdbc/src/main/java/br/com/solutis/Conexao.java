package br.com.solutis;

import java.sql.SQLException;
import java.util.Scanner;

public class Conexao {

    public static void main(String[] args) throws SQLException {

        DataSourceEscola ds = new DataSourceEscola();

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do aluno que deseja pesquisar:");
        String nomeAluno = scan.nextLine();
        System.out.println(ds.getDadosAluno(nomeAluno));

        System.out.println("Informe o nome do professor que deseja pesquisar:");
        String nomeProfessor = scan.nextLine();
        System.out.println(ds.getDadosProfessor(nomeProfessor));
    }
}
