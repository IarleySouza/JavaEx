package exerciciosjava;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //5) Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a
        // ser pago com desconto de 10% se a quantidade for maior que 10 unidades.

        System.out.println("Digite o valor do produto:");
        double precoProduto = sc.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = sc.nextInt();

        double precoTotal = precoProduto * quantidade;
        if (quantidade >= 10) {
            double soma = precoTotal - (precoTotal * 0.10);
            System.out.printf("Valor total a ser pago com desconto: %.2f%n", soma);
        }else {
            System.out.printf("Valor total a ser pago: %.2f%n", precoTotal);
        }




    }
}
