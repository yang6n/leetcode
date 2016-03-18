package factorial;

/**
 * Created by jyang on 3/17/16.
 */
public class Main {

    public static long factorial(long n) {
        if (n == 0) return 0;

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        for (long i = 0; i < 21; i++) {
            System.out.printf("factorial(%3d): %24d, tailing %d zero(s).\n", i, factorial(i), i / 5);
        }
    }
}
