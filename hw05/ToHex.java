//Joe Freeman
//Feb 22, 2015
// CSE 002
// hw5 To hex converstion

// Write a program to take three inputted decimal numbers and then
// convert them to hexidecimal values

import java.util.Scanner;
public class ToHex{
    public static void main(String[] args){
Scanner myScanner = new Scanner(System.in);
System.out.println("Please enter 3 RGB values in decimal form");
int num1= 0;
int num2= 0;
int num3= 0;
if(myScanner.hasNextInt()){
    num1= myScanner.nextInt();
}
else{
    System.out.println("Please enter integers");
    return;
}    
if(myScanner.hasNextInt()){
     num2= myScanner.nextInt();
}
else{
    System.out.println("Please enter integers");
    return;
}
if(myScanner.hasNextInt()){
    num3= myScanner.nextInt();
}
else{
    System.out.println("Please enter integers");
    return;
}
if(num1<0 || num1>255 || num2<0 || num2>255 || num3<0 || num3>255){
    System.out.println("Please enter intergers in the range 0-255");
    return;
}

String hex1 = Integer.toString(num1,16);
String hex2 = Integer.toString(num2,16);
String hex3 = Integer.toString(num3,16);
if(num1<16){
    hex1 = "0"+hex1;
}
if(num2<16){
    hex2 = "0"+hex2;
}
if(num3<16){
    hex3 = "0"+hex3;
}

String hex = "" +hex1 + hex2 + hex3;
System.out.println("The decimal numbers R:" +num1 + ", G:" + num2 + ", B:" +num3+ " is represented in hexadecimal by " +hex);



}}