package ProgrammingChallenges;
import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int input;

        System.out.println("Enter integers to sum (enter 0 to finish):");

        while(true){
            input = sc.nextInt();
        if(input == 0){
            break;
        }
        sum += input;
    }
    System.out.println("The sum of all integers is: " + sum);
    }
}

