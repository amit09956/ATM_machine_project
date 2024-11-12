import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void gradeCalculator(int numberOfSub) {
        float sum = 0;
        System.out.println("Enter the numbber of Subjects\n");
        for (int i = 0; i < numberOfSub; i++) {
            try {
                Scanner sc = new Scanner(System.in);

                float a = sc.nextFloat();
                if (a <= 100) {

                    sum = sum + a;
                } else {
                    System.out.println("Enter the currect number that means between 0-100");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }

        }
        System.out.println("Total marks:" + sum);
        float average_percentage = sum / numberOfSub;
        System.out.println("Average percentage:" + average_percentage);
        int total_marks = numberOfSub * 100;
        float percentage = (sum / total_marks) * 100;
        if (percentage >= 90) {
            System.out.println("A -grade");
        } else if (percentage >= 80) {
            System.out.println("B-grade");
        } else if (percentage >= 70) {
            System.out.println("C-grade");
        } else if (percentage >= 60) {
            System.out.println("D-grade");
        } else if (percentage >= 50) {
            System.out.println("E-grade");
        } else {
            System.out.println("F-grade");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Eneter the number of Subjects");
            int subjects = sc.nextInt();

            gradeCalculator(subjects);
        } catch (Exception e) {
            System.out.println("Enter the valid input ");
        }
    }
}