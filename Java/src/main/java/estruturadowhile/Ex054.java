package estruturadowhile;
import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e exiba a média
        // aritmética dos valores lidos.

        int cont = 1, soma = 0;

        do {
            System.out.print("Digite o " + cont +" número");
            int num = sc.nextInt();
            soma += num;
            cont++;
        } while (cont <= 5);
        System.out.println("A media aritmetica é: " + soma / 5);
        sc.close();
    }

}
