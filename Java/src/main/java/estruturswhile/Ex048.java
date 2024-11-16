package estruturswhile;

import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //48)Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o
        // loop "while".

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.print("Dígitos separados: ");

        int divisor = 1;
        while (numero / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            System.out.print(numero / divisor + " ");
            numero %= divisor;
            divisor /= 10;
        }

    }
}
