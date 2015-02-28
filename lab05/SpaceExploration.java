//Joe Freeman
// 2/28/15
//Lab 05 Space Exploration

//Program will generate a time line of random length and then give all space exploration related event that occured during that period


public class SpaceExploration {
                  // main method required for every Java program
                 public static void main(String[] args) {
int year =(int)(Math.random()*11) + 2000;
System.out.println("here is a timeline of space exploration from the year " + year + " to 2000");
switch (year){
    case 2010:
        System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
    case 2009:
        System.out.println("2009: N/A");
    case 2008:
        System.out.println("2008: Kepler launched to study deep space");
    case 2007:
        System.out.println("2007: N/A");
    case 2006:
        System.out.println("2006: Spacecraft returns with collections from comet");
    case 2005:
        System.out.println("2005: Spacecraft collides with comet");
    case 2004:
        System.out.println("2004: N/A");
    case 2003:
        System.out.println("2003: Largest infrared telescope released");
    case 2002:
        System.out.println("2002: N/A");
    case 2001:
        System.out.println("2001: First Spacecraft lands on astroid");
    case 2000:
       System.out.println("2000: First Spacecraft orbits astrioid");
       break;
}
}}