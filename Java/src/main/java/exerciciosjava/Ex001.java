package exerciciosjava;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        //1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão
        // entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("A soma desses numeros são: " + (num1 + num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A divisão é: " + (num2 / num1));
        System.out.println("A multiplicação é: " + (num1 * num2));

    }
}
