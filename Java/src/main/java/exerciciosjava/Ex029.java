package exerciciosjava;
import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina
        // Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.

        System.out.print("Qual o nome do aluno? ");
        String nome = sc.nextLine();

        System.out.print("Digite um a nota do aluno:  ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("O aluno " + nome + "aprovado!");
        }else {
            System.out.println("O aluno " + nome + " recuperção!");
        }





    }
}
