package Exercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    String nome;
    String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (!cargoValido(cargo)) {
            cargo = "Senior";
        }
        this.cargo = cargo;
    }

    private Boolean cargoValido(String cargo) {
        String[] cargosValidos = {"Starter", "Junior", "Senior"};
        return Arrays.asList(cargosValidos).contains(cargo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Controle de Funcionários:");

        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome da " + (i+1) + "º pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Informe o cargo da " + (i+1) + "º pessoa (Starter, Junior, Senior):");
            String cargo = scanner.nextLine();

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setCargo(cargo);

            pessoas.add(pessoa);
        }

        System.out.println("Total de pessoas");

        long starterContador = pessoas
                .stream()
                .filter(c -> c.getCargo().equals("Starter"))
                .count();

        System.out.println("Starter: " + starterContador);
    }
}
