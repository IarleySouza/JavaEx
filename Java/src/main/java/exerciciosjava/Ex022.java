package exerciciosjava;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o
        // salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.

        System.out.print("Digite o valor de seu salário: ");
        double valor = sc.nextDouble(), sal = 0;

        if (valor > 2000) {
            sal = valor + (valor * 0.10);
            System.out.print("Salário com o aumento de 10%: " + sal);
        }else {
            sal = valor + (valor * 0.05);
            System.out.print("Salário com o aumento de 5%: " + sal);
        }
    }
}
