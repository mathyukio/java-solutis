package elasticcode.solutis.exercicio47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        List<Paciente> pacientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            Paciente paciente = new Paciente();
            System.out.println("Digite o nome do paciente: ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            paciente.setNome(nome);
            System.out.println("Digite o seu sexo: ");
            paciente.setSexo(sc.nextLine());
            System.out.println("Digite o seu peso: ");
            paciente.setPeso(sc.nextDouble());
            System.out.println("Digite a sua idade: ");
            paciente.setIdade(sc.nextInt());
            System.out.println("Digite a sua altura: ");
            paciente.setAltura(sc.nextDouble());
            sc.nextLine();

            pacientes.add(paciente);
        }
        sc.close();

        verificarQuantidadePacientes(pacientes);
        mediaIdadeHomens(pacientes);
        verificarQuantidadePacientesMulher(pacientes);
        verificarQuantidadePorIdade(pacientes);
        verificarPacientesMaisVelho(pacientes);
        verificarPacienteMuherMaisBaixa(pacientes);
        mediaIdadeMulher(pacientes);

    }

    public static void verificarQuantidadePacientes(List<Paciente> pacientes) {
        System.out.println("Quantidade de pacientes: " + pacientes.size());
    }

    public static void mediaIdadeHomens(List<Paciente> pacientes) {
        Integer somaIdades = 0;
        Integer contador = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equalsIgnoreCase("Masculino")) {
                somaIdades += paciente.getIdade();
                contador++;
            }
        }


        double media = (double) somaIdades / contador;
        System.out.println("A média de idade dos pacientes homens é: " + media);

    }

    public static void verificarQuantidadePacientesMulher(List<Paciente> pacientes) {

        List<Paciente> mulheres = new ArrayList<>();

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equalsIgnoreCase("Feminino") &&
                    (paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70) && paciente.getPeso() > 70.0) {
                mulheres.add(paciente);
            }
        }
        System.out.println("A quantidade de pacientes mulheres com altura " +
                "entre 1,60 até 1,70 com peso superior à 70kgs é: " + mulheres.size());

    }

    public static void verificarQuantidadePorIdade(List<Paciente> pacientes) {

        List<Paciente> quantidadePacientesPorIdade = new ArrayList<>();

        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() >= 18 && paciente.getIdade() <= 25) {
                quantidadePacientesPorIdade.add(paciente);
            }
        }

        System.out.println("A quantidade de pacientes com idade entre 18 e 25 anos é: "
                + quantidadePacientesPorIdade.size());
    }

    public static void verificarPacientesMaisVelho(List<Paciente> pacientes) {
        Integer idadeMaisVelho = -1;
        String nomeMaisVelho = "";

        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() > idadeMaisVelho) {
                idadeMaisVelho = paciente.getIdade();
                nomeMaisVelho = paciente.getNome();
            }
        }

        System.out.println("Paciente mais velho: " + nomeMaisVelho + " (" + idadeMaisVelho + " anos)");
    }

    public static void verificarPacienteMuherMaisBaixa(List<Paciente> pacientes) {
        Double maisBaixa = 1000.0;
        String mulherMaisBaixa = "";

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equals("Feminino")){
                if (paciente.getAltura() < maisBaixa){
                    maisBaixa = paciente.getAltura();
                    mulherMaisBaixa = paciente.getNome();
                }
            }
        }

        System.out.println("Paciente mulher mais baixa: " + mulherMaisBaixa + " (" + maisBaixa + " anos)");
    }

    public static void mediaIdadeMulher(List<Paciente> pacientes) {
        Integer somaIdades = 0;
        Integer contador = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equalsIgnoreCase("Feminino")) {
                somaIdades += paciente.getIdade();
                contador++;
            }
        }

        double media = (double) somaIdades / contador;
        System.out.println("A média de idade dos pacientes mulheres é: " + media);
    }

}

