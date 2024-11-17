package vetores;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.

        List<Integer> list = new ArrayList<Integer>();
        int cont = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero % 2 == 0) {
                cont++;
            }

        }
        System.out.println("Sua lista é: " + cont);
        System.out.println("Existem " + cont + " números pares.");
    }
}
