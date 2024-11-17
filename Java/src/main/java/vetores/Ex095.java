package vetores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o nome: ");
            nomes.add(sc.nextLine());
        }
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println("Orde alfabética: " + nomes);
    }
}
