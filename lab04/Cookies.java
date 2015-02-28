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

if(myScanner.hasNextInt()){
    int nPeople = myScanner.nextInt();    
    System.out.print( "Enter the number of cookies you are planning to buy: ");
   
    if(myScanner.hasNextInt()){
        int nCookies = myScanner.nextInt();
        System.out.print( "How many cookies will each person get? ");
        
        if(myScanner.hasNextInt()){
            int nCookiesPerPerson = myScanner.nextInt();
            
            if(nCookies/nPeople>=nCookiesPerPerson && nCookies%nPeople==0){
                System.out.println("You have enough cookies for each person and the amount will divide evenly");
            }
            else if(nCookies/nPeople>=nCookiesPerPerson && nCookies%nPeople!=0){
                System.out.println("You have enough cookies for each person but the amount will not divide evenly");
            }
            else{
                int moreCookies = nPeople*nCookiesPerPerson-nCookies;
                System.out.println("You do not have enough Cookies, you will need to buy at least " +moreCookies+ " more cookies");
                
                
            }
        }
      
        else{
            System.out.println("You did not enter an int greater than 0");
            return;    //leaves the program, i.e.
                //the program terminates
        }
    }   

    else{
        System.out.println("You did not enter an int greater than 0");
        return;    //leaves the program, i.e.
                //the program terminates
    }
 
}   
    
else{
  System.out.println("You did not enter an int greater than 0");
  return;    //leaves the program, i.e.
                //the program terminates
}


}}
