package Recursion1;

//Если n из 1 или более, верните факториал n, который является n * (n-1) * (n-2) ... 1.
// Вычислите результат рекурсивно (без циклов).
//факториал (1) → 1
//факториал (2) → 2
//факториал (3) → 6
public class Factorial {
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
