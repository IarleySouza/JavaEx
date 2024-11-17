package vetores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a
        // quantidade de números negativos.

        List<Integer> list = new ArrayList<Integer>();
        int positivo = 0, negativo = 0;

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero > 0) {
                positivo++;
            }else{
                negativo++;
            }

        }
        System.out.println("Positivo: " + positivo + " Negativo: " + negativo);
    }
}
