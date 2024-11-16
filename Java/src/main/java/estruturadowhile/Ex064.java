package estruturadowhile;
import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando
        // o loop "do-while".

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        do {
            fatorial *= n;
            n--;
        } while (n > 0);
        System.out.println(fatorial);
    }
}
