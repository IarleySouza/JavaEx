package exerciciosjava;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.
        float media = 0;
        for (float num = 1; num <= 3; num++) {
            System.out.printf("\n" + "Digite a %.0fª nota: ", num);
            float nota = sc.nextFloat();
            media = nota / 3;
        }
        System.out.printf("Media dos alunos: %.2f", media);
    }
}
