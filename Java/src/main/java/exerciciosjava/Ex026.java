package exerciciosjava;
import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor
        // total a ser pago. Considere que cada produto tem um preço diferente

        System.out.println("Tabela de Preços:");
        System.out.println("1 - R$ 10.50");
        System.out.println("2 - R$ 26.87");
        System.out.println("3 - R$ 13.30");
        System.out.println("4 - R$ 82.99");

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;
        switch (codigo) {
            case 1 -> preco = 10.50;
            case 2 -> preco = 20.75;
            case 3 -> preco = 15.30;
            case 4 -> preco = 8.99;
            default -> {
                System.out.println("Código inválido!");
                return;
            }
        }
        double total = preco * quantidade;
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", total);

        sc.close();
    }
}
