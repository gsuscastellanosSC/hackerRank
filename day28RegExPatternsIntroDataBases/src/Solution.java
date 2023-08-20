import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Solution {

    public static Boolean findWithRegex(String emailID) {
        String patternString = "\\b\\S+@gmail\\.com\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(emailID);
        return matcher.find();
    }

    public static void firstNames(List<String> names, String firstName, String emailID) {
        if (findWithRegex(emailID)) {
            names.add(firstName);
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = new ArrayList<>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                firstNames(names, firstName, emailID);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}