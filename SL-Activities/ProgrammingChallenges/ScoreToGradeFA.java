package ProgrammingChallenges;
import java.util.Scanner;

public class ScoreToGradeFA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your grade? ");
        int grade = sc.nextInt();

        if (grade < 60) {
            System.out.println("F Grade");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D Grade");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C Grade");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B Grade");
        } else if (grade >= 90) {
            System.out.println("A Grade");
        } else {
            System.out.println("Invalid grade");
        }

        sc.close();
    }
}