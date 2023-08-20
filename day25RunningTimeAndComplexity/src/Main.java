import java.util.Scanner;

//https://es.wikipedia.org/wiki/Criba_de_Erat%C3%B3stenes
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution.isPrime(n);
        }
    }
}