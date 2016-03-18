package factorial;

import java.math.BigInteger;

/**
 * Created by jyang on 3/17/16.
 */
public class MainBigInt {

    public static String factorial(int n) {

        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i < 121; i++) {
            System.out.printf("factorial(%3d): %s, tailing %d zero(s).\n", i, factorial(i), i / 5);
        }
    }
}
