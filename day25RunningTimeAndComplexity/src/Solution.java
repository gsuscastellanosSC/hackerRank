
public class Solution {

    public static boolean cribaEratostenes(int n) {
        if (n <= 1) {
            return Boolean.FALSE;
        }
        if (n <= 3) {
            return Boolean.TRUE;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return Boolean.FALSE;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static void isPrime(int number) {
        if (cribaEratostenes(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}