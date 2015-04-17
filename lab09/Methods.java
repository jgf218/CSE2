//Joe Freeman
//CSE 002 
//lab 09 
import java.util.Random;
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
Scanner scan = new Scanner(System.in);
while(true){
    System.out.println("The " +adjective()  + " "+ noun() + " " + verb() + " the " + object());
System.out.println("would you like to go again? enter y to continue") ;   
String answer = scan.nextLine();
if (("y").equals(answer) ) {
    continue;
}
else{
    return;
}
}
     
     
     
}
public static String adjective(){
    String adj = " ";
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0:
        adj = "big";
        break;
    case 1:
        adj = "HUGE";
        break;
    case 2:
        adj = "giant";
        break;
    case 3:
        adj = "tiny";
        break;   
    case 4:
        adj = "small";
        break;
    case 5:
        adj = "funny";
        break;
    case 6:
        adj = "ugly";
        break;
    case 8:
        adj = "pretty";
        break;
    default:
        adj = "cool";
        break;
}
return adj;
   
}
public static String noun(){
    String adj = " ";
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0:
        adj = "dog";
        break;
    case 1:
        adj = "cat";
        break;
    case 2:
        adj = "ant";
        break;
    case 3:
        adj = "horse";
        break;   
    case 4:
        adj = "pig";
        break;
    case 5:
        adj = "bird";
        break;
    case 6:
        adj = "fish";
        break;
    case 8:
        adj = "chicken";
        break;
    default:
        adj = "cow";
        break;
}
return adj;
   
}
public static String verb(){
    String adj = " ";
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0:
        adj = "ran";
        break;
    case 1:
        adj = "jumped";
        break;
    case 2:
        adj = "hugged";
        break;
    case 3:
        adj = "walked";
        break;   
    case 4:
        adj = "saw";
        break;
    case 5:
        adj = "looked";
        break;
    case 6:
        adj = "rolled";
        break;
    case 8:
        adj = "gazed";
        break;
    default:
        adj = "caught";
        break;
}
return adj;
   
}
public static String object(){
    String adj = " ";
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0:
        adj = "bat";
        break;
    case 1:
        adj = "log";
        break;
    case 2:
        adj = "ball";
        break;
    case 3:
        adj = "pen";
        break;   
    case 4:
        adj = "book";
        break;
    case 5:
        adj = "phone";
        break;
    case 6:
        adj = "drink";
        break;
    case 8:
        adj = "paper";
        break;
    default:
        adj = "food";
        break;
}
return adj;
   
}
}
      