package exerciciosjava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int num = 1; num <= 3; num++) {
            System.out.print("Digite o " + num + " número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        System.out.println("Números na ordem original: " + numeros);
        Collections.sort(numeros);
        System.out.print("Números na ordem crescente: " );
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
