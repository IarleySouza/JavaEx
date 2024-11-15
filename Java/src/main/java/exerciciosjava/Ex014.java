package exerciciosjava;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias
        // de vida ela tem.

        System.out.println("Digite o ano de seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Digite o mes de seu nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o dia de seu nascimento: ");
        int dia = sc.nextInt();

        int total = (ano * 365) + (mes * 30) + dia;
        System.out.println("A total de dias de vida: " + total);
    }
}
