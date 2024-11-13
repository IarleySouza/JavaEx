package exerciciosjava;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //6) Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par.");
        }
        else {
            System.out.println("É impar.");
        }

    }
}
