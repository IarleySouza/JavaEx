package exerciciosjava;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double sal = sc.nextDouble();

        double total = sal + (sal * 0.15);

        System.out.printf("Seu novo sálario com um aumento de 15/100 é: R$%.2f " , total);
    }
}
