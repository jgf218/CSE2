//Joe Freeman
//Feb 22, 2015
// CSE 002
// hw6 get run factorials

// the program acalculated the factorial for an inputted number


public class MakeSymbols{
    public static void main(String[] args){
int RandomNum = (int) (Math.random() *100 + 1);  // generate random number between 1 and 100
System.out.println(RandomNum);

if(RandomNum%2==0){  // test if the number is even
   do {
    System.out.print("*"); // if even print out the number in *
    RandomNum--;
    }while(RandomNum>0);
}
else{
    do  {
    System.out.print("&");   // if odd print out the number in &
    RandomNum--;
    } while(RandomNum>0);
    
}
System.out.println(" ");   // end the line of text

}
}