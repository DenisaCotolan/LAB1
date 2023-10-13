package ex5;
import java.util.Random;

public class MainApp {
    public static boolean isFibonacci(int n) {
        if (n <= 1) {
            return true;
        }

        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == n;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int numarAleatoriu = random.nextInt(21); // Generează un număr întreg între 0 și 20

        System.out.println("Numărul generat aleatoriu este: " + numarAleatoriu);

        if (isFibonacci(numarAleatoriu)) {
            System.out.println(numarAleatoriu + " aparține șirului lui Fibonacci.");
        } else {
            System.out.println(numarAleatoriu + " nu aparține șirului lui Fibonacci.");
        }
    }
}
