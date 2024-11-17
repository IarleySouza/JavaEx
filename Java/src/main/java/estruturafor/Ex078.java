package estruturafor;
import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.print("Dígitos separados: ");

        int divisor = 1;
        for (;numero / divisor >= 10;) {
            divisor *= 10;
        }

        for (;divisor > 0;) {
            System.out.print(numero / divisor + " ");
            numero %= divisor;
            divisor /= 10;
        }
    }
}
