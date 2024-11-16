package estruturafor;

public class Ex075 {
    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (;a <= 20;){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}
