package exerciciosjava;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando
        // que o funcionário recebe 5% de comissão sobre o salário base.


        System.out.print("Digite seu saláio: ");
        double a = sc.nextDouble();

        double soma = a + (a * 0.5);

        System.out.printf("Seu salário é: %.2f", soma);

    }
}
