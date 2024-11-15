package exerciciosjava;
import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago. O
        // preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a
        // quantidade for igual ou maior que 12.

        System.out.print("Número de maçãs? ");
        double n = sc.nextInt();

        if (n < 12){
            n = n * 0.50;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        } else {
            n = n * 0.40;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        }

    }
}
