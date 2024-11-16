package estruturswhile;

public class Ex047 {
    public static void main(String[] args) {

        //47) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".

        int cont = 1;

        System.out.print("Números ímpares: ");
        while (cont <= 50) {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}
