package estruturswhile;

public class Ex038 {
    public static void main(String[] args) {

        //38) Crie um programa que exiba os números pares de 1 a 50 usando o loop "while".

        int cont = 1;

        while (cont <= 50) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}
