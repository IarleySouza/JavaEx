package estruturafor;
import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //79) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário.

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (;n > 0;) {
            fatorial *= n;
            n--;
        }
        System.out.println(fatorial);
    }
}
