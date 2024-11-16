package estruturadowhile;

public class Ex053 {
    public static void main(String[] args) {

        //53) Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".

        int cont = 1;

        do {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }while (cont <= 50);
    }
}
