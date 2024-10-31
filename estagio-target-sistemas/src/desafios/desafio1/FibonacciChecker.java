package desafios.desafio1;

public class FibonacciChecker {

    public static void main(String[] args) {
        int number = 21;

        if (isFibonacciNumber(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacciNumber(int num) {
        int a = 0, b = 1;

        if (num == 0 || num == 1) {
            return true;
        }

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }
}
