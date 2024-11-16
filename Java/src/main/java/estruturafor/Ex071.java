package estruturafor;
import java.util.Scanner;

public class Ex071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //71) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.print("Os divisores desse número são: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
