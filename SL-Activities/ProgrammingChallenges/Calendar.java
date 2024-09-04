package ProgrammingChallenges;
import java.util.Scanner;
import java.time.YearMonth;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        if(month < 1 || month > 12){
            System.out.println("Invalid Input, 1-12 only.");
        }
            else{
        YearMonth yearMonth = YearMonth.of(year, month);

        int daysInMonth = yearMonth.lengthOfMonth();

        
        
        switch(month){
            case 1:
            if(month == 1){
                System.out.println("January");
                System.out.println("The month" + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 2:
            if(month == 2){
                System.out.println("February");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 3:
            if(month == 3){
                System.out.println("March");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 4:
            if(month == 4){
                System.out.println("April");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 5:
            if(month == 5){
                System.out.println("May");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 6: 
            if(month == 6){
                System.out.println("June");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 7:
            if(month == 7){
                System.out.println("July");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 8:
            if(month == 8){
                System.out.println("August");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 9:
            if(month == 9){
                System.out.println("September");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 10:
            if(month == 10){
                System.out.println("October");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 11: 
            if(month == 11){
                System.out.println("November");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            case 12:
            if(month == 12){
                System.out.println("December");
                System.out.println("The month " + month + " of year " + year + " has " + daysInMonth + " days.");
            }
            break;
            default:
            System.out.println("Invalid Input, 1-12 only.");
            break;
        }
    }
        sc.close();
    }
}
