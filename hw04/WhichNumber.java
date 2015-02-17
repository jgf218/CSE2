//Joe Freeman
// 2/14/15
//Homework 04 Which number

// Program prompts the user to enter a number between 1 and 10 and then guesses which number it is

import java.util.Scanner;
public class WhichNumber {
                  // main method required for every Java program
                 public static void main(String[] args) {
Scanner myScanner;
String y="y";
String Y="Y";
String n="n";
String N="N";
myScanner = new Scanner( System.in );
System.out.print( "Enter a number between 1 and 10: ");
int number = myScanner.nextInt();
System.out.print( "Is the number even? ");
String answer = myScanner.next();
if (answer.equals(y) || answer.equals(Y)) {
    System.out.print( "Is the number divisible by 3? ");
    answer = myScanner.next();
    if (answer.equals(y) || answer.equals(Y)) {
        System.out.print("Is your number 6?");
        answer = myScanner.next();
        if (answer.equals(y) || answer.equals(Y)) {
            System.out.println("Yay!!!");
        }
        else {
            System.out.println("Sorry please try again");
        }
    }   
    else if (answer.equals(n) || answer.equals(N)) {
        System.out.print("Is your number divisible by 4?");
        answer = myScanner.next();
        if (answer.equals(y) || answer.equals(Y)) {
            System.out.print("Is your number divided by 4 greater than 1?");
            answer = myScanner.next();
            if (answer.equals(y) || answer.equals(Y)) {
            System.out.print("Is your number 8?");
            answer = myScanner.next();
                if( answer.equals(y) || answer.equals(Y)) {
                 System.out.println("Yay!!!");
                }
                else {
                     System.out.println("Sorry please try again");
                }
            }   
           
                else if ( answer.equals(n) || answer.equals(N)){
                System.out.print("Is your number 4?");
                answer = myScanner.next();
                    if (answer.equals(y) || answer.equals(Y)) {
                    System.out.println("Yay!!!");
                    }
                    else {
                         System.out.println("Sorry please try again");
                    }
                }
                 else {
                                System.out.println("Sorry please try again");
                        }
        }    
        else if ( answer.equals(n) || answer.equals(N)){
            System.out.print("Is your dumber divisible by 5?");
            answer = myScanner.next();
            if( answer.equals(y) || answer.equals(Y)){
                System.out.println("Is your number 10?");
                answer = myScanner.next();
                if (answer.equals(y) || answer.equals(Y)) {
                System.out.println("Yay!!!");
                }
                else {
                  System.out.println("Sorry please try again");
                }
            }    
            else if ( answer.equals(n) || answer.equals(N)){    
            System.out.print("Is your number 2?");
            answer = myScanner.next();
                if (answer.equals(y) || answer.equals(Y)) {
                System.out.println("Yay!!!");
                }
                else {
                    System.out.println("Sorry please try again");
                }
            }
             else {
                                System.out.println("Sorry please try again");
                        }
        }
         else {
                                System.out.println("Sorry please try again");
                        }
    }
     else {
                                System.out.println("Sorry please try again");
                        }
}
   
else if(answer.equals(n) || answer.equals(N)){
    System.out.print( "Is the number divisible by 3? ");
    answer = myScanner.next();
    if (answer.equals(y) || answer.equals(Y)) {
    System.out.println("Is the number divided by 3 greater than 1?");
    answer = myScanner.next();
         if( answer.equals(y) || answer.equals(Y)){
            System.out.println("Is your number 9?");
            answer = myScanner.next();
            if (answer.equals(y) || answer.equals(Y)) {
                System.out.println("Yay!!!");
            }
            else {
             System.out.println("Sorry please try again");
                }
        }
          else if ( answer.equals(n) || answer.equals(N)){    
            System.out.print("Is your number 3");
            answer = myScanner.next();
                if (answer.equals(y) || answer.equals(Y)) {
                System.out.println("Yay!!!");
                }
                else {
                    System.out.println("Sorry please try again");
                }
          }
           else {
                                System.out.println("Sorry please try again");
                        }
    }
    else if( answer.equals(n) || answer.equals(N)){ 
         System.out.print( "Is the number Greater than 6? ");
         answer = myScanner.next();
             if (answer.equals(y) || answer.equals(Y)) {
                 System.out.print("Is your number 7?");
                 answer = myScanner.next();
                if (answer.equals(y) || answer.equals(Y)) {
                     System.out.println("Yay!!!");
                }
                else {
                     System.out.println("Sorry please try again");
                }
             }  
             else if ( answer.equals(n) || answer.equals(N)){ 
                  System.out.print( "Is the number less than 3? ");
                  answer = myScanner.next();
                  if( answer.equals(y) || answer.equals(Y)){
                        System.out.print("Is your number 1?");
                        answer = myScanner.next();
                        if (answer.equals(y) || answer.equals(Y)) {
                            System.out.println("Yay!!!");
                        }
                        else {
                            System.out.println("Sorry please try again");
                            }
                    }
                    else if ( answer.equals(n) || answer.equals(N)){    
                        System.out.print("Is your number 5");
                        answer = myScanner.next();
                            if (answer.equals(y) || answer.equals(Y)) {
                                System.out.println("Yay!!!");
                            }
                            else {
                                System.out.println("Sorry please try again");
                            }
                    }
                     else {
                                System.out.println("Sorry please try again");
                        }
             }
              else {
                                System.out.println("Sorry please try again");
                        }
    }
     else {
                                System.out.println("Sorry please try again");
                        }
}
    else {
        System.out.println("Sorry please try again");
    }

}
}
