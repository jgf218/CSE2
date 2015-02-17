//Joe Freeman
// 2/14/15
//Homework 04 Banking

// Program prompts the user choose what banking function to do with a random generated amount of money

import java.util.Scanner;
public class Banking {
                  // main method required for every Java program
                 public static void main(String[] args) {
Scanner myScanner;
myScanner = new Scanner( System.in );
double accountAmount1= Math.random() * 4 + 1;
double accountAmount2 = accountAmount1 * 1000;


System.out.println("Press 1 to deposit money ");
System.out.println("Press 2 to Withdraw money ");
System.out.println("Press 3 to view Account balance ");
int customerChoice = myScanner.nextInt();

switch (customerChoice){
    case 1:
        System.out.print("How much would you like to Deposit? ");
        double depositAmount = myScanner.nextDouble();
        double newDeposit = depositAmount+accountAmount2;
        if (depositAmount>0){
           System.out.printf ("You now have $%6.2f in your account" , newDeposit);
           System.out.println(" ");
        }
        else {
            System.out.print("Enter a value greater than $0.00 in order to deposit");
        }
        break;
    case 2: 
        System.out.print("How much would you like to withdraw? ");
        double withdrawAmount = myScanner.nextDouble();
        double newWithdraw = accountAmount2-withdrawAmount;
        if (withdrawAmount>0 && withdrawAmount<accountAmount2){
           System.out.printf ("You now have $%6.2f in your account" , newWithdraw);
           System.out.println(" ");
        }
        else if(withdrawAmount<0){
            System.out.print("Enter a value greater than $0.00 to withdraw");
        }
        else {
            System.out.println("You have requested to withdraw more than your account holds");
        }    
        break;
    case 3:
        System.out.printf ("You have $%6.2f in your account" , accountAmount2);
        System.out.println(" ");
        break;
    default:
        System.out.println("That is not an option. Please select a number 1 through 3.");
}





}}