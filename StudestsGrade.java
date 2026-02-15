import java.util.Scanner;

class GradeProcessor {
    public double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public char determineLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class StudestsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeProcessor processor = new GradeProcessor();

        System.out.print("How many grades do you want to enter? ");
        int count = scanner.nextInt();

        double[] grades = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double average = processor.calculateAverage(grades);
        char letterGrade = processor.determineLetterGrade(average);

        System.out.println("Results ---");
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + letterGrade);

        
    }
}