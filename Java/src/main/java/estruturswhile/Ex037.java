package estruturswhile;

public class Ex037 {
    public static void main(String[] args) {

        //37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".

        int soma = 0, cont = 1;

        while (cont <= 100) {
            soma += cont;
            cont++;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
