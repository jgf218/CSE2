//Joe Freeman
// 3/6/15
//Lab 07 ZigZag

import java.util.Scanner;
public class zigzag {
                  // main method required for every Java program
                 public static void main(String[] args) {
 Scanner myScanner;
myScanner = new Scanner( System.in );
String y="y";
String Y="Y";
String answer = "y";
while (answer.equals(y)|| answer.equals(Y)){
System.out.println("Please enter an integer between 3 and 33");
int i =1;
while(i<2){
i++;
if (myScanner.hasNextInt()){
    int nStars= myScanner.nextInt();
    if (nStars>=3 && nStars<=33){
        int count =0;
        while (count<nStars){
            System.out.print("*");
            count++;
        }
        System.out.println(" ");
        count=0;
        int spaces=0;   
        while (count<nStars){
            spaces=0;
            while(count>spaces){
                System.out.print(" ");
                spaces++;
            }
            System.out.println("*");
            count++;
        }
        
        count =0;
        while (count<nStars){
            System.out.print("*");
            count++;
        }
        System.out.println(" ");
    }
    else{
        System.out.println("You did not enter an integer between 3 and 33, please try again");
        i--;
    }   
}
else{
    System.out.println("You did not enter an integer between 3 and 33, please try again");
    i--;
     myScanner.next();
} 
}

System.out.println("enter y or Y to go again");
answer = myScanner.next();
}
}
}