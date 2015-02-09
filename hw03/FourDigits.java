// Joe Freeman
// 2/8/2015
// HW 03
// CSE 002 section 111



import java.util.Scanner;
public class FourDigits {
        // main method required for every Java program
       public static void main(String[] args) {
Scanner myScanner;
myScanner = new Scanner( System.in );
System.out.print( "Enter a double in the form ##.####: ");
double myDouble= myScanner.nextDouble();  //enter the number
int myInt = (int) (myDouble * 10000);
int decimals = myInt%10000;
System.out.println( "The first four deicmals are " +decimals);
}
}