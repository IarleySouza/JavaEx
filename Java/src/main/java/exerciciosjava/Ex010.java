package exerciciosjava;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
