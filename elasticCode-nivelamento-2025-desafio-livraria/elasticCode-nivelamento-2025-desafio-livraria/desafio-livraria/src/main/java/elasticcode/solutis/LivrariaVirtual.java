package elasticcode.solutis;

import elasticcode.solutis.dao.EletronicoDAO;
import elasticcode.solutis.dao.ImpressoDAO;
import elasticcode.solutis.dao.VendaDAO;
import elasticcode.solutis.entity.Eletronico;
import elasticcode.solutis.entity.Impresso;
import elasticcode.solutis.entity.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivrariaVirtual {

    private final Integer MAX_IMPRESSOS = 100;
    private final Integer MAX_ELETRONICOS = 100;
    private final Integer MAX_VENDAS = 100;

    // LISTA DE LIVROS
    private List<Impresso> impressos = new ArrayList<>();
    private List<Eletronico> eletronicos = new ArrayList<>();

    // NUMERO DE LIVROS
    private Integer numVendas = 0;

    public static Scanner lt = new Scanner(System.in);

    EletronicoDAO eletronicoDAO = new EletronicoDAO();
    ImpressoDAO impressoDAO = new ImpressoDAO();
    VendaDAO vendaDAO = new VendaDAO();

    public static void main(String[] args) {
        LivrariaVirtual loja = new LivrariaVirtual();

        int option;

        do{
            String menu = """
                \n
                Digite uma opção:
                    1 - Cadastrar livro
                    2 - Realizar uma venda
                    3 - Listar livros
                    4 - Listar vendas
                    5 - sair do programa
                """;

            System.out.println(menu);
            option = lt.nextInt();

            switch (option){
                case 1:
                    loja.cadastrarLivro();
                    break;
                case 2:
                    loja.realizarVenda();
                    break;
                case 3:
                    loja.listarLivros();
                    break;
                case 4:
                    loja.listarVendas();
                    break;
                case 5:
                    System.out.println("Até mais!");
                    loja.eletronicoDAO.fechar();
                    loja.impressoDAO.fechar();
                    loja.vendaDAO.fechar();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    loja.eletronicoDAO.fechar();
                    loja.impressoDAO.fechar();
                    loja.vendaDAO.fechar();
                    break;
            }
        } while (option != 5);

    }
    
    public void cadastrarLivro(){
        boolean valido = false;

        // SETANDO ATRIBUTOS DO LIVRO
        lt.nextLine();
        System.out.print("Escreva o titulo do livro: ");
        String titulo = lt.nextLine();

        System.out.print("Escreva o autor do livro: ");
        String autor = lt.nextLine();

        System.out.print("Escreva a editora do livro: ");
        String editora = lt.nextLine();

        System.out.print("Escreva o preço do livro: ");
        Float preco = lt.nextFloat();

        System.out.print("\n1 Impresso --- 2 Eletrônico --- 3 ambos: ");
        int tipo = lt.nextInt();

        if((tipo == 1 || tipo == 3) && impressos.size() < MAX_IMPRESSOS) {
            System.out.println("Cadastrando livro impresso: ");

            System.out.println("Valor do frete: ");
            Float frete = lt.nextFloat();

            System.out.println("Quantidade no estoque: ");
            Integer qtdEstoque = lt.nextInt();

            Impresso impresso = new Impresso(titulo, autor, editora, preco, frete, qtdEstoque);
            impressoDAO.salvar(impresso);
            valido = true;
        }

        if((tipo == 2 || tipo == 3) && eletronicos.size() < MAX_ELETRONICOS){
            System.out.println("Cadastrando livro virtual: ");

            System.out.println("Tamanho do livro: ");
            Integer tmLivro = lt.nextInt();

            Eletronico eletronico = new Eletronico(titulo, autor, editora, preco, tmLivro);
            eletronicoDAO.salvar(eletronico);
            valido = true;

        }

        if(!valido){
            System.out.println("Opção inválida!!!");
        }
    }

    public void realizarVenda() {

        if (numVendas >= MAX_VENDAS) {
            System.out.println("Limite máximo de vendas atingido. Não é possível realizar mais vendas.");
            return;
        }

        System.out.print("Escreva o nome do cliente: ");
        lt.nextLine();
        String nomeCliente = lt.nextLine();

        System.out.print("Insira a quantidade de livros para venda: ");
        int qtdLivro = lt.nextInt();
        lt.nextLine();

        Venda venda = new Venda();
        venda.setNomeCliente(nomeCliente);

        for (int i = 0; i < qtdLivro; ) {
            System.out.println("\nTipo de livro:\n 1 - Impresso\n 2 - Eletrônico");
            int tipo = lt.nextInt();

            if (tipo == 1) {
                List<Impresso> impressosDisponiveis = impressoDAO.listarTodos();
                if (impressosDisponiveis.isEmpty()) {
                    System.out.println("Nenhum livro impresso cadastrado!");
                    continue;
                }

                for (int j = 0; j < impressosDisponiveis.size(); j++) {
                    System.out.println(j + " - " + impressosDisponiveis.get(j));
                }

                System.out.print("\nDigite o índice do livro desejado: ");
                int indexLivro = lt.nextInt();

                if (indexLivro >= 0 && indexLivro < impressosDisponiveis.size()) {
                    venda.addLivro(impressosDisponiveis.get(indexLivro));
                    impressoDAO.decrementarEstoque(impressosDisponiveis.get(indexLivro).getId());
                    i++;
                } else {
                    System.out.println("Índice inválido para livro impresso.");
                }

            } else if (tipo == 2) {
                List<Eletronico> eletronicosDisponiveis = eletronicoDAO.listarTodos();
                if (eletronicosDisponiveis.isEmpty()) {
                    System.out.println("Nenhum livro eletrônico cadastrado!");
                    continue;
                }

                for (int j = 0; j < eletronicosDisponiveis.size(); j++) {
                    System.out.println(j + " - " + eletronicosDisponiveis.get(j));
                }

                System.out.print("\nDigite o índice do livro desejado: ");
                int indexLivro = lt.nextInt();

                if (indexLivro >= 0 && indexLivro < eletronicosDisponiveis.size()) {
                    venda.addLivro(eletronicosDisponiveis.get(indexLivro));
                    i++;
                } else {
                    System.out.println("Índice inválido para livro eletrônico.");
                }

            } else {
                System.out.println("Opção inválida! Escolha 1 para impresso ou 2 para eletrônico.");
            }
        }

        Double valorTotal = Math.round(venda.getValor() * 100.0) / 100.0;
        venda.setValor(valorTotal);
        vendaDAO.salvar(venda);
        numVendas++;
        System.out.println("Venda realizada com sucesso!");
    }


    public void listarLivrosImpressos(){
        List<Impresso> impressosTodos = impressoDAO.listarTodos();
        if(impressosTodos.isEmpty()){
            System.out.println("Nenhum livro impresso cadastrado!");
        } else{
            for (int i = 0; i < impressosTodos.size(); i++) {
                System.out.println(impressosTodos.get(i).toString());
            }
        }
    }

    public void listarLivrosEletronicos(){
        List<Eletronico> eletronicosTodos = eletronicoDAO.listarTodos();
        if (eletronicosTodos.isEmpty()){
            System.out.println("Nenhum livro eletrônico cadastrado!");
        } else{
            for (int i = 0; i < eletronicosTodos.size(); i++) {
                System.out.println(eletronicosTodos.get(i).toString());
            }
        }
    }

    public void listarLivros(){
        System.out.println("\n - Índice de todos os livros");

        listarLivrosImpressos();
        listarLivrosEletronicos();
    }

    public void listarVendas(){
        List<Venda> vendaTodos = vendaDAO.listarTodos();
        if (vendaTodos.isEmpty()){
            System.out.println("Nenhum livro eletrônico cadastrado!");
        } else{
            for (int i = 0; i < vendaTodos.size(); i++) {
                System.out.println(vendaTodos.get(i).toString());
            }
        }
    }
}