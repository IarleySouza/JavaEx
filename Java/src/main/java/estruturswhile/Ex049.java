package estruturswhile;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //49) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando
        // o loop "while".

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        while (n > 0) {
            fatorial *= n;
            n--;
        }
        System.out.println(fatorial);
    }
}
