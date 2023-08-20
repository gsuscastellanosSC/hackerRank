import java.util.HashSet;
import java.util.Set;

public class Result {


    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int maxAnd = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int currentAnd = i & j;
                if (currentAnd > maxAnd && currentAnd < K) {
                    maxAnd = currentAnd;
                }
            }
        }
        return maxAnd;
    }
}
