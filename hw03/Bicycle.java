// Joe Freeman
// 2/8/2015
// HW 03
// CSE 002 section 111



import java.util.Scanner;
public class Bicycle {
        // main method required for every Java program
       public static void main(String[] args) {
Scanner myScanner;
myScanner = new Scanner( System.in );
System.out.print( "Enter the number of wheel rotations as an integer greater than zero: ");
int nRotations = myScanner.nextInt();  //enter the rotations
System.out.print( "Enter the length of the trip in secconds: ");
int nSeconds = myScanner.nextInt(); // enter the time
double wheelDiameter=27.0,  //  diameter of the wheel in inches
        PI=3.14159, //  stores the value of PI
        feetPerMile=5280,  // Number of feet in a mile
        inchesPerFoot=12,   //  number of inches in a foot
        secondsPerMinute=60,  //  number of seconds per min
        minPerHour = 60;   // min per hour
double   distanceTrip=(nRotations*wheelDiameter*PI)/ inchesPerFoot/feetPerMile;
System.out.println( "The Trip was " + distanceTrip+ " miles and took "+ (nSeconds/secondsPerMinute)+ " min" );
double timeInHours= nSeconds/secondsPerMinute/minPerHour;
double averageSpeed = distanceTrip/timeInHours;
System.out.println( "Your average speed was " +averageSpeed+ " mph" );
}
}