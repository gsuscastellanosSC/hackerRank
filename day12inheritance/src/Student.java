import src.Person;


public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }


    public String calculate() {
        int a = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            a = a + testScores[i];
        }
        int averange = a / this.testScores.length;
        return gradingScale(averange);
    }

    public String gradingScale(int averange) {
        if (90 <= averange && averange <= 100) {
            return "O";
        } else if (80 <= averange && averange <= 90) {
            return "E";
        } else if (70 <= averange && averange <= 80) {
            return "A";
        } else if (55 <= averange && averange < 70) {
            return "P";
        } else if (40 <= averange && averange < 55) {
            return "D";
        }
        return "T";
    }
}
