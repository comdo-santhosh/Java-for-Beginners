
// switch state is one switch with multiple cases

import java.util.Scanner;  // Scanner class used for Get input from user

public class Switch_statement_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Getting Choice from user  (input) by using Scanner class
        System.out.println("******************************************************");
        System.out.println("************Enter the Day You born********************");
        System.out.println("1.Monday");
        System.out.println("2.Tuesday");
        System.out.println("3.Wednesday");
        System.out.println("4.Thursday");
        System.out.println("5.Friday");
        System.out.println("6.Saturday");
        System.out.println("7.Sunday");
        System.out.println("----Enter in between 1 to 7---");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something Went Wrong Please enter in between 1 to 7");
                break;
        }
    }
}
