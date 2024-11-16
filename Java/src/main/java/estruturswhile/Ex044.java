package estruturswhile;
import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média
        // das idades.

        int n = 1, soma = 0;

        while (n <= 5) {
            System.out.print("Digite o nome da " + n + " pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da " + n + " pessoa: ");
            int idade = sc.nextInt();

            soma=+ idade;

            n++;
        }
        System.out.printf("A media das idades é: %.2f", soma/5);
    }
}
