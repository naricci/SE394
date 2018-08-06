/**
 * The Asymptotic Complexity of The Fibonacci Series is exponential.
 *
 * O(n) = O(2^n)
 */
public class Fibonacci {

    public static void main(String[] args) {

        // Print out Fibonacci Numbers...
        int n = 10, t1 = 0, t2 = 1, sum = 0;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        Fib(3);
    }

    public static int Fib(int n) {
        if (n <= 1) {
            System.out.println("\n" + n);
            return n;
        } else {
            System.out.println("\n" + Fib(n - 1) + Fib(n - 2));
            return Fib(n - 1) + Fib(n - 2);
        }
    }
}