import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    private static void swapNew(List<Integer> a, Integer j) {
        int tmp = a.get(j);
        a.set(j, a.get(j + 1));
        a.set(j + 1, tmp);
    }

    private static void printOutput(int sum, int firstElement, int lastElement) {
        System.out.println("Array is sorted in ".concat(String.valueOf(sum)).concat(" swaps."));
        System.out.println("First Element: ".concat(String.valueOf(firstElement)));
        System.out.println("Last Element: ".concat(String.valueOf(lastElement)));
    }

    private static void bubleSort(List<Integer> a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swapNew(a, j);
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            sum = sum + numberOfSwaps;
        }
        int firstElement = a.get(0);
        int lastElement = a.get(n - 1);
        printOutput(sum, firstElement, lastElement);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        bubleSort(a, n);
        bufferedReader.close();
    }
}