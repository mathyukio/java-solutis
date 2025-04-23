package br.com.solutis;

import java.sql.*;

public class DataSourceEscola {

    private Connection conexao;

    public DataSourceEscola() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection) DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/escola?useSSL=false", "root", "#Gf50705473805");
            System.out.println("Conexão estabelecida!!");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro Driver Jdbc!" + cnfe.getLocalizedMessage());
        } catch (SQLException sqle) {
            System.out.println("Conexão falhou!");
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    public String getDadosAluno(String nomeAluno) {

        String sqlConsulta = "SELECT cod_aluno,nome,matricula,numdisciplinas FROM aluno WHERE nome like ?";

        PreparedStatement prepareStmt = null;
        ResultSet retQuery = null;
        StringBuffer dadodRet = new StringBuffer();

        try {
            prepareStmt = (PreparedStatement) this.getConexao().prepareStatement(sqlConsulta);
            prepareStmt.setString(1, "%" + nomeAluno + "%");
            retQuery = prepareStmt.executeQuery();

            if (retQuery.next()) {
                dadodRet.append("Código: ");
                dadodRet.append(retQuery.getInt("cod_aluno"));
                dadodRet.append("\nNome: ");
                dadodRet.append(retQuery.getString("nome"));
                dadodRet.append("\n\tMatrícula: ");
                dadodRet.append(retQuery.getString("matricula"));
                dadodRet.append("\nNúmero de disciplinas: ");
                dadodRet.append(retQuery.getInt("numdisciplinas"));
            }
        } catch (Exception e) {
            dadodRet.append("Erro ao executar a consulta: "+e.getMessage());
        }
        return dadodRet.toString();
    }

    public String getDadosProfessor(String nomeProfessor) {

        String sqlConsulta = "SELECT cod_prof,nome,disciplina,idade FROM professor WHERE nome like ?";

        PreparedStatement prepareStmt = null;
        ResultSet retQuery = null;
        StringBuffer dadodRet = new StringBuffer();

        try {
            prepareStmt = (PreparedStatement) this.getConexao().prepareStatement(sqlConsulta);
            prepareStmt.setString(1, "%" + nomeProfessor + "%");
            retQuery = prepareStmt.executeQuery();

            if (retQuery.next()) {
                dadodRet.append("Código: ");
                dadodRet.append(retQuery.getInt("cod_prof"));
                dadodRet.append("\nNome: ");
                dadodRet.append(retQuery.getString("nome"));
                dadodRet.append("\n\tDisciplina: ");
                dadodRet.append(retQuery.getString("disciplina"));
                dadodRet.append("\nIdade: ");
                dadodRet.append(retQuery.getInt("idade"));
            }
        } catch (Exception e) {
            dadodRet.append("Erro ao executar a consulta: "+e.getMessage());
        }
        return dadodRet.toString();
    }
}
