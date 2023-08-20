import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] actuallyReturnedDate = bufferedReader.readLine().split(" ");
        String[] expectedReturnedDate = bufferedReader.readLine().split(" ");
        System.out.println(Solution.fine(actuallyReturnedDate, expectedReturnedDate));

    }
}