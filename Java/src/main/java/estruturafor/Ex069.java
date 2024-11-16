package estruturafor;

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.

        int soma = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número");
            int num = sc.nextInt();
            soma += num;
        }
        System.out.println("A media aritmetica é: " + soma / 5);
        sc.close();
    }

}
