package estruturadowhile;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo
        // valor usando o loop "do-while".

        System.out.print("Digite um número para saber sua tabuada: ");
        int n = sc.nextInt();
        int cont = 1;

        do {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }while (cont <= 10);

    }
}
