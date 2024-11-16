package estruturadowhile;
import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número
        // lido usando o loop "do-while".

        System.out.print("Digite um número: ");
        int limite = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }while (a <= limite);
    }
}
