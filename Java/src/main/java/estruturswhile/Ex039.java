package estruturswhile;
import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética
        // dos valores lidos.

        int cont = 1, soma = 0;

        while (cont <= 5){
            System.out.print("Digite o " + cont +" número");
            int num = sc.nextInt();
            soma += num;
            cont++;
        }
        System.out.println("A media aritmetica é: " + soma / 5);
        sc.close();
    }
}
