//Joe Freeman
//April 15, 2015
// CSE 002
// lab 11


import java.util.Scanner;
public class ArrayInputs {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter the size of the array; ");
int size= scan.nextInt();
int array[] = new int[size];
for(int i= 0; i < size; i++){
    System.out.println("Please enter a positive integer to fill the array");
    
if(scan.hasNextInt() ){  
        int integer = scan.nextInt();  
        if(integer >= 0) { 
        array[i] = integer;
        
            
        }
        else { 
            
            System.out.println("Invalid input, try again");
            i--;
            
        }
     }
     
     else{  
         System.out.println("Invalid input, try again");
         scan.next();
         i--;
     }
}
System.out.println("The array is: ");
System.out.print("{ ");
for(int i= 0; i < size; i++){
System.out.print(array[i]+ ", ")  ;  
}
System.out.println("}");
}}