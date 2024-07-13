import java.util.Scanner;
public class ThreeNumbers {
public static void main(String[] args) {
  
      int num1,num2,num3;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter First number: ");
      num1 = sc.nextInt();
      
      System.out.print("Enter Second number: ");
      num2 = sc.nextInt();
      
      System.out.print("Enter Second number: ");
      num3 = sc.nextInt();
      
      if(num1 == num2 && num1 == num3){
          System.out.println("All numbers are equal");
      }
      else if(num1 >= num2 && num1 >= num3){ //num1
           System.out.println("The largest number is: " + num1);
      }
      else if(num2 >= num1 && num2 >= num3){ //num2
           System.out.println("The largest number is: " + num2);
      }
      else if(num3 >= num1 && num3 >= num2){ //num3
          System.out.println("The largest number is: " + num3);
      }
      
      else{ // VALIDATION
          System.out.println("Please input numbers only.");
      }
    }  
}