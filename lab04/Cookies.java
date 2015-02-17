//Joe Freeman
// 2/13/15
//Lab 04 Cookies

// Program will ask user for how many cookies they want and how many people are attending
//as well as how many cookies each person will get and see if they bought enough cookies

import java.util.Scanner;
public class Cookies {
                  // main method required for every Java program
                 public static void main(String[] args) {
 Scanner myScanner;
myScanner = new Scanner( System.in );
System.out.print( "Enter the number of people: ");
int nPeople = nextInt();
if(myScanner.hasNextInt())
{
    
    System.out.print( "Enter the number of cookies you are planning to buy: ");
    int nCookies = myScanner.nextInt();
    if(myScanner.hasNextInt()){
        System.out.print( "How many cookies will each person get? ");
        int nCookiesPerPerson = myScanner.nextInt();
        if(myScanner.hasNextInt()){
        System.out.println("go" +nCookies);
        }
      
        else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                //the program terminates
}
    }
    else{
        System.out.println("You did not enter an int");
        return;    //leaves the program, i.e.
                //the program terminates
}
 
    
    }
else{
  System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}


}}
