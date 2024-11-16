package estruturafor;
import java.util.Scanner;

public class Ex073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número
        // lido.

        System.out.print("Digite um número: ");
        int limite = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        for (; a<= limite;){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
