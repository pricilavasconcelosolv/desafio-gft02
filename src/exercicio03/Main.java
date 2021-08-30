package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Multiplicando:");

        int multiplicando = scanner.nextInt();

        if (multiplicando < 0 || multiplicando > 1500) {
            System.out.print("Multiplicando não pode ser negativo e não pode ser maior que 1500");
            return;
        }

        System.out.print("Início do intervalo:");
        int inicioIntervalo = scanner.nextInt();

        if (inicioIntervalo < 0 || inicioIntervalo > 1500) {
            System.out.print("Início do intervalo não pode ser negativo e não pode ser maior que 1500");
            return;
        }

        System.out.print("Fim do intervalo:");
        int fimIntervalo = scanner.nextInt();

        if (fimIntervalo < 0 || fimIntervalo > 1500) {
            System.out.print("Fim do intervalo não pode ser negativo e não pode ser maior que 1500");
            return;
        }

        if (inicioIntervalo <= fimIntervalo) {
            System.out.print("O início do intervalo deve ser menor que seu fim");
        } else {
            System.out.print("Parabéns!! O início do intervalo é menor que seu fim");
        }
    }
}