import java.util.Scanner;

public class StringActivity{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Input any word: ");
        String userInput = sc.nextLine();
        
        System.out.println("The length of the word is: " + userInput.length());
        System.out.println("To uppercase: " + userInput.toUpperCase());
        System.out.println("To lowercase: " + userInput.toLowerCase());
        System.out.println("The first character of the word is: " + userInput.charAt(0));
        System.out.println("The last character of the word is: " + userInput.charAt(userInput.length() -1));
        
        if(userInput.length() >= 5){
        System.out.println("The second to the fifth character of the word is: " + userInput.substring(1, 5));
        }
        else{
            System.out.println("The word is too short to print the second to fifth character.");
        }
        sc.close();
    }
}