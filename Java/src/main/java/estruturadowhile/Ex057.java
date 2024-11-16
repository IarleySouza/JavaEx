package estruturadowhile;
import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop
        // "do-while".

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        boolean ehPrimo = true;
        int divisor = 2;

        int mul = divisor * divisor;

        do {
            if (n % divisor == 0) {
                ehPrimo = false;
                break;
            }
            mul++;
        } while (mul <= n);

        if (ehPrimo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        sc.close();
    }
}
