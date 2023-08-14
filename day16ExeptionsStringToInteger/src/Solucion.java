import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solucion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.err.println("Bad String");
        }
        bufferedReader.close();
    }
}
