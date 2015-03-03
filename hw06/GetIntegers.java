//Joe Freeman
//Feb 22, 2015
// CSE 002
// hw6 get integers

// the program asks the user for 5 integers and then finds the sum of them

import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
Scanner myScanner = new Scanner(System.in);
System.out.println("Please enter 5 non-negative integers:");

int sum=0;  // start the sum at 0
for (int count =1; count<6; count++){  // set up loop to accept up to 5 correct values
   
     
    if(myScanner.hasNextInt() ){  // test if the value is a integer
        int integer = myScanner.nextInt();  // input value
        if(integer > 0) {  // test if int is positive
            sum = sum + integer;  // if it is add it to the sum
        }
        else {  // if it isnt ask for another value and subtract one from the count
            
            System.out.println("Invalid input, try again");
            count--;
            
        }
     }
     
     else{  // if it isnt an integere ask for another value and subtract one from the count
         System.out.println("Invalid input, try again");
         myScanner.next();
         count--;
     }
     
    
     
}
System.out.println("The sum is: " +sum);  // print the sum
}}