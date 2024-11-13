package exerciciosjava;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área do círculo: %.2f%n", area);
        System.out.printf("Perímetro do círculo: %.2f%n", perimetro);
    }
}
