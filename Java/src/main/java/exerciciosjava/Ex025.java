package exerciciosjava;
import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua
        // situação. Se o número de faltas for maior que 15, ele é reprovado por falta.

        System.out.print("Digite seu número de faltas: ");
        int faltas = sc.nextInt();

        if (faltas > 15) {
            System.out.println("Está reprovado por faltas.");
        }else {
            System.out.println("Cuidado para nao reprovar em faltas.");
        }
    }
}
