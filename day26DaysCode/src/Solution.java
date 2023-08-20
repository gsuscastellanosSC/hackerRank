import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {

    public static int fine(String[] actuallyReturnedDate, String[] expectedReturnedDate) {

        int d1 = Integer.parseInt(actuallyReturnedDate[0]);
        int m1 = Integer.parseInt(actuallyReturnedDate[1]);
        int y1 = Integer.parseInt(actuallyReturnedDate[2]);

        int d2 = Integer.parseInt(expectedReturnedDate[0]);
        int m2 = Integer.parseInt(expectedReturnedDate[1]);
        int y2 = Integer.parseInt(expectedReturnedDate[2]);

        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        int fine = 0;

        if (date1.isBefore(date2) || date1.equals(date2)) {
            fine = 0;
        } else if (date1.isAfter(date2)) {
            if (m1 == m2 && y1 == y2) {
                fine = (int) (15 * ChronoUnit.DAYS.between(date1, date2));
            } else if (m1 > m2 && y1 == y2) {
                fine = (int) (500 * ChronoUnit.MONTHS.between(date1, date2));
            } else if (y1 > y2) {
                fine = 10000;
            }
        }
        return fine >= 0 ? fine : fine * -1;
    }
}
