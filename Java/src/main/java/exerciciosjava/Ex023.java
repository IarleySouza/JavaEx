package exerciciosjava;
import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui.
        // Considere apenas meses válidos.

        System.out.print("Digite o nome do mês: ");
        String mes = sc.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês " + mes + " tem 31 dias.");
                break;
            case "fevereiro":
            case "abril":
            case "junho":
            case "setembro":
                System.out.println("O mês " + mes + " tem 29 dias.");
                break;
            default:
                System.out.println("Esse mês não é valído.");

        }


    }
}
