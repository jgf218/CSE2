// Joe Freeman
// 1/30/2015
// CSE 002 section 111

//Cyclometer project - cyclometers measure wheel rotations and time for a bike trip
// Given a time and rotation count for two seperate trips
//the program will print out 
// number of minutes for each trip
//the number of wheel rotations
//the distance of each trip
//the combined distance

// Document your program. What does MPG do? Place you comments here!
public class Cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {
// our input data. Document your variables by placing your
        // comments after the “//”. State the purpose of each variable.

        int secsTrip1=480;  // time for trip 1 in sec
        int secsTrip2=3220;  //time for trip 2 in sec
        int countsTrip1=1561;  // wheel rotations for trip 1
        int countsTrip2=9037; //  wheel rotations for trip 2
        double wheelDiameter=27.0,  //  diameter of the wheel in inches
        PI=3.14159, //  stores the value of PI
        feetPerMile=5280,  // Number of feet in a mile
        inchesPerFoot=12,   //  number of inches in a foot
        secondsPerMinute=60;  //  number of seconds per min
        double distanceTrip1, distanceTrip2,totalDistance;  // sets up three variables for the length of the trips
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //These calculations are finding the distance of each of the trips, first in inches by using the rotations 
        //in inches and then converting that to miles
        //
    distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    }  //end of main method   
} //end of classjava Cyclometer
