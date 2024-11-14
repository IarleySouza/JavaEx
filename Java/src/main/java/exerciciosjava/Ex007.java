package exerciciosjava;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve
        // ficar com o valor do segundo e vice-versa.

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        num = num2;
        num2 = num;
        System.out.println(num2);
        System.out.println(num);
    }
}
