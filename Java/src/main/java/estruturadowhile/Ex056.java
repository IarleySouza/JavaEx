package estruturadowhile;
import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //56) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número
        // usando o loop "do-while".

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int cont = 1;

        System.out.print("Os divisores desse número são: ");
        do {
            if (n % cont == 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }while (cont <= n);
    }
}
