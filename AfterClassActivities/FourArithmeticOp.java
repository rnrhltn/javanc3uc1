import java.util.Scanner;
public class FourArithmeticOp {

    int num1;
    int num2;

    int Summation(){
        return num1 + num2;
    }

    int Subtraction(){
        return num1 - num2;
    }
    
    int Product(){
        return num1 * num2;
    }

    double Quotient(){
        if (num2 == 0) {
            return Double.NaN; 
        } else {
            return (double) num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FourArithmeticOp fat = new FourArithmeticOp();

        System.out.print("Enter the first number: ");
        fat.num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        fat.num2 = sc.nextInt();

        int sum = fat.Summation();
        int sub = fat.Subtraction();
        int prod = fat.Product();
        double quo = fat.Quotient();

        System.out.println("The Summation of the two number is: " + sum);
        System.out.println("The Subtraction of the two number is: " + sub);
        System.out.println("The Product of the two number is: " + prod);

        if (Double.isNaN(quo)) { 
            System.out.println("Anything divided by 0 is undefined.");
        } else {
            System.out.println("The Quotient of the two numbers is: " + quo);
        }
    }
}
