//Joe Freeman
//cse002 hw08
//HW8

import java.util.Scanner;

public class HW8{
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
public static String getInput(Scanner scan, String string){
    String answer = scan.next();
    if (string.contains(answer) ){
        return answer;
    }
    else{
        System.out.println("Yeah right LOSER");
        System.exit(0);
    }
    return answer;
    
}
public static String getInput(Scanner scan, String string, int trial){
int test = 0;
String answer= "n";
while (test<trial){
      answer = scan.next();
      String a = "a";
      String A = "A";
    if (string.contains(answer)){
        if(answer.equals(a)|| answer.equals(A) )   {
            int attack = (int) (Math.random()*10);
            if (attack%2 == 1){
                test ++;
                System.out.println("Critical Hit!");
            }
            else{
                System.out.println("You Missed!");
            }
        }
        else{
            int escape = (int) (Math.random()*10 + 1);
            if (escape==10){
                System.out.println("You have successfully escaped");
                System.exit(0);
            }
            else{
                System.out.println("Escape failed!");
            }
            
            
        }
    }
    else{
        System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
    }
    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
    
}
return answer;    
}  

public static String getInput(Scanner scan){
    String a = "a";
   if(scan.hasNextInt()){
     int answer = scan.nextInt();
    String result = "n";
    switch (answer){
        case 1:
            System.out.println("You got 1000 pieces of gold");
            break;
        case 2:
            System.out.println("You got a new sword");
            break;
        case 3:
            System.out.println("You got a diamond ring");
            break;
        default:
            System.out.println("A wrong number! You get nothing! Better restart the game LOL");
            System.exit(0);
    }
    }
    else{
System.out.println("A wrong number! You get nothing! Better restart the game LOL");
            System.exit(0);
    }
    return a;

}
}