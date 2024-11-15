package exerciciosjava;
import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade
        // e quantas são maiores de idade.

        int maior = 0, menor = 0;


        for (int num = 1; num <= 4; num++) {
            System.out.print("Digite um numero: ");
            int nu = sc.nextInt();
            if (nu >= 18) {
                maior++;
            }else {
                menor++;
            }

        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maior);
        System.out.println("Quantidade de pessoas menores de idade: " + menor);

    }
}
