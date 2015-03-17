//Joe Freeman
// 3/6/15
//HW 07 Number Waves


// Program will take an inputted number between 1 and 30 and create a wave out of it
import java.util.Scanner;
public class waves {
                  // main method required for every Java program
                 public static void main(String[] args) {
 Scanner myScanner;    // import and assign scanner
myScanner = new Scanner( System.in );
System.out.print("Please enter an integer between 1 and 30: ");   // ask user for an inputted value
int i =1;
while(i<2){   // run a while loop to enure that exactly one acceptable value is eventually entered
i++;
    if (myScanner.hasNextInt()){  // test if inputted value is an integer
        int number= myScanner.nextInt();
        if (number>=1 && number<=30){  // if it is an integer and it falls between the accepted range, run the wave portion of the program
            System.out.println("FOR LOOP:");
            for( int forCount = 1; forCount<=number; forCount++ ) { // set up a loop to run the number of times as the iputeed value
                if(forCount%2==0){  // test if the current cycle is printing an even or an odd number
                    for( int forRepeat = 1; forRepeat<=forCount; forRepeat++ ) {  //set up a loop to break the line every time it is run
                        for( int forLine = 1; forLine<=forRepeat; forLine++ ) {   //Set up a loop to print the number in an increasing pyrimid structure until it print the number the same amount of times as its value
                        System.out.print(forCount);
                        } 
                    System.out.println(" ");    
                    }    
                } 
                else{ // test if the current cycle is printing an even or an odd number
                    for( int forRepeat = 1; forRepeat<=forCount; forRepeat++ ) { //set up a loop to break the line every time it is run
                        for( int forLine = forCount; forLine>=forRepeat; forLine-- ) {   //Set up a loop to print the number in an decreasing pyrimid structure strting with it printing the number the same amount of times as its value
                        System.out.print(forCount);
                        } 
                    System.out.println(" ");    
                    }       
                }
            } 
            System.out.println("WHILE LOOP:");
            int forCount = 1;
            while(forCount<=number  ) {// set up a loop to run the number of times as the iputeed value
                if(forCount%2==0){ // test if the current cycle is printing an even or an odd number
                    int forRepeat = 1;
                    while(  forRepeat<=forCount  ) {//set up a loop to break the line every time it is run
                        int forLine = 1;
                        while(  forLine<=forRepeat  ) { //Set up a loop to print the number in an increasing pyrimid structure until it print the number the same amount of times as its value
                        System.out.print(forCount);
                        forLine++;
                        } 
                    System.out.println(" ");
                    forRepeat++;
                    }    
                } 
                else{ // test if the current cycle is printing an even or an odd number
                    int forRepeat = 1;
                    while(  forRepeat<=forCount  ) {//set up a loop to break the line every time it is run
                        int forLine = forCount;
                        while(  forLine>=forRepeat  ) {//Set up a loop to print the number in an decreasing pyrimid structure strting with it printing the number the same amount of times as its value
                        System.out.print(forCount);
                        forLine--;
                        } 
                    System.out.println(" ");   
                    forRepeat++;
                    }       
                }
                forCount++;
            }
             System.out.println("DO WHILE LOOP:");
             forCount = 1;
            do {   // set up a loop to run the number of times as the iputeed value
                if(forCount%2==0){ // test if the current cycle is printing an even or an odd number
                    int forRepeat = 1;
                   do { //set up a loop to break the line every time it is run
                        int forLine = 1;
                       do {  //Set up a loop to print the number in an increasing pyrimid structure until it print the number the same amount of times as its value
                        System.out.print(forCount);
                        forLine++;
                        }  while(  forLine<=forRepeat  );
                    System.out.println(" ");
                    forRepeat++;
                    } while(  forRepeat<=forCount  )  ;  
                } 
                else{ // test if the current cycle is printing an even or an odd number
                    int forRepeat = 1;
                    do { //set up a loop to break the line every time it is run
                        int forLine = forCount;
                        do { //Set up a loop to print the number in an decreasing pyrimid structure strting with it printing the number the same amount of times as its value
                        System.out.print(forCount); 
                        forLine--;
                        } while(  forLine>=forRepeat  );
                    System.out.println(" ");   
                    forRepeat++;
                    }while(  forRepeat<=forCount  ) ; // set up a loop to run the number of times as the iputeed value
                }
                forCount++;
            }while(forCount<=number  );
        }
        else{
            System.out.println("You did not enter an integer between 1 and 30, please try again");
            i--;
        }
    }
    else{
            System.out.println("You did not enter an integer between 1 and 30, please try again");
               i--;
               myScanner.next();
        }
}
}}
 
