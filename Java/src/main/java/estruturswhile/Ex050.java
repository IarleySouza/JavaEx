package estruturswhile;
import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //50) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while" até que o
        // nome "fim" seja informado. Ao final, exiba a média das idades.

        double soma = 0;
        int cont = 0;

        while (true) {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine().toLowerCase();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
            cont++;

        }
        System.out.printf("A media das idades são: %.2f", soma / cont);
    }
}
