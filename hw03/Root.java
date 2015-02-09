// Joe Freeman
// 2/8/2015
// HW 03
// CSE 002 section 111



import java.util.Scanner;
public class Root {
        // main method required for every Java program
       public static void main(String[] args) {
Scanner myScanner;
myScanner = new Scanner( System.in );
System.out.print( "Enter a double in the form ##.##: ");
double myDouble= myScanner.nextDouble();  //enter the number
double guess1 = myDouble/3;
double estimate1 = (2 * guess1*guess1*guess1+myDouble)/(3*guess1*guess1);
double guess2 = estimate1;
double estimate2 = (2 * guess2*guess2*guess2+myDouble)/(3*guess2*guess2);
double guess3 = estimate2;
double estimate3 = (2 * guess3*guess3*guess3+myDouble)/(3*guess3*guess3);
double guess4 = estimate3;
double estimate4 = (2 * guess4*guess4*guess4+myDouble)/(3*guess4*guess4);
double guess5 = estimate4;
double estimate5 = (2 * guess5*guess5*guess5+myDouble)/(3*guess5*guess5);

System.out.println( "The cube root is " + estimate5);
System.out.println( + estimate5 + " * " +estimate5+ " * " +estimate5+" = " +(estimate5*estimate5*estimate5) );
}
}