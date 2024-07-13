import java.util.Scanner;
public class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num < 0){
            System.out.println("The number is Even and negative");
        }
        else if(num % 2 == 0 && num > 0){
            System.out.println("The number is Even and positive");
        }
        else if(num % 3 == 0 && num < 0){
            System.out.println("The number is odd and negative");
        }
        else if(num % 3 == 0 && num > 0){
            System.out.println("The number is odd and positive");
        }
        else if(num == 0){
            System.out.println("The number is zero and It's neither positive nor negative");
        }
        else{
            System.out.println("Invalid Input!");
        }       
        sc.close();
    }
}