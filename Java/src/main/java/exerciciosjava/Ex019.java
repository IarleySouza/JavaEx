package exerciciosjava;
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado.
        // A média para aprovação é 7.

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovado!");

        }else {
            System.out.println("Reprovado!");
        }
    }
}
