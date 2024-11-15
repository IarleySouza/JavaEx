package exerciciosjava;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double depositoMensal = sc.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double taxaJuros = sc.nextDouble() / 100;

        double montante = 0;

        for (int mes = 1; mes <= 12; mes++) {
            montante = (montante + depositoMensal) * (1 + taxaJuros);
        }

        System.out.printf("O montante acumulado após 12 meses é: R$%.2f%n", montante);

        sc.close();
    }
}
