package exerciciosjava;
import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de
        // saudação de acordo com o turno. Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".

        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Digite o turno do aluno: ");
        char turno = sc.nextLine().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " +aluno );
        }else {
            System.out.println("Boa tarde, " +aluno );
        }
    }
}
