package vetores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.

        List<Integer> lista = new ArrayList<Integer>();

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            lista.add(num);
        }
        System.out.println("Lista: " + lista);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Em ordem crescente: " + lista);
    }
}
