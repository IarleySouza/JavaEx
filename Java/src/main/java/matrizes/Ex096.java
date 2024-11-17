package matrizes;
import java.util.Scanner;

public class Ex096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //96) Faça um programa que leia uma matriz 3x3 de números inteiros e exiba a matriz na tela.

        int[][] matriz = new int[3][3];

        System.out.println("Digite os números:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
