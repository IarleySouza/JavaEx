package estruturadowhile;
import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre
        // 1 e o número lido usando o loop "do-while".

        System.out.print("Digite um número: ");
        int n = sc.nextInt(), cont = 1, soma = 0;

        do {
            if (cont % 2 == 0) {
                soma += cont;
            }
            cont++;

        } while (cont <= n);
        System.out.println(soma);
    }

}
