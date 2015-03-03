//Joe Freeman
//Feb 22, 2015
// CSE 002
// hw6 get run factorials

// the program acalculated the factorial for an inputted number

import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
Scanner myScanner = new Scanner(System.in);
System.out.println("Please enter an integer between 9 and 16 inclusivly:");

int integer = 1; // start integer as a set value 1
int count =1; 
while (count<2){  // run the following program until there has been 1 complete run through
    
    count++; // increase the count
    if(myScanner.hasNextInt() ){  // if the number is an integer continue on this path
        integer = myScanner.nextInt();  // ask for an inputted integer
        if(integer >= 9 && integer <=16) {  // test if the integer falls in the correct range
            
            
        }
        else {  // if it does not print the following line and subtract one from count
            
            System.out.println("Invalid input, try again");
            count--;
            
        }
     }
     
     else{  // if the imputted value is not an int, print the following and reduce count by 1
         System.out.println("Invalid input, try again");
         myScanner.next();
         count--;
     }
}
int integervalue = integer;
int factorial = 1;  // create value for the factorial
while(integer>0){
    factorial= factorial *integer;  // calculate the factorial step by step
    integer--;
    
}
System.out.println(integervalue+"! = " +factorial);   // print result
}
}
