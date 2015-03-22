//Joe Freeman
//march 21, 2015
// CSE 002
// lab 08

// program asks for a number and then calculates the factorial

import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter an integer: ");
        int sup = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= sup; i++){
            sum += factorial(i);
        }
        print(sum);
  }
    public static int factorial(int integer){
        int facVal = 1;
        for (int i = 1; i <= integer; i++){
            facVal *= i;
        }
        System.out.println(facVal);
        return facVal;
    }
    public static void print(int num){
        System.out.println("The super factorial is equal to " + num);
    }
}