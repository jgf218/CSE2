//Joe Freeman
//April 10, 2015
// CSE 002
// lab 11


import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
int array1[]=new int[50];
int array2[]=new int[50];
for(int i = 0; i<50; i++){
    array1[i] =(int) ((Math.random() *100 )+ 1);
}
System.out.println("the maximum of array1 is: " +maxval(array1));
System.out.println("the minimum of array1 is: " +minval(array1));

array2[0] =(int) ((Math.random() *100 )+ 1);
for(int c = 1; c<50; c++){
    int num = (int) ((Math.random() *100 )+ 1);
    array2[c] = array2[c-1] + num;
}
System.out.println("the maximum of array2 is: " +maxval(array2));
System.out.println("the minimum of array2 is: " +minval(array2));
System.out.println("Enter an int: ");
if(scan.hasNextInt()){
    int num = 0;
    num = scan.nextInt();
    if (num>=0){
      binarysearch(array2, num);
    }
          
    else{
    System.out.println("sorry please enter an integer greater than 0");
    return;    
        }
        
    }
else{
  System.out.println("sorry please enter an integer value");
  return;
    }
   

}











public static int maxval(int[] array) {
  int m= 0;
  for (int i=0; i<array.length; i++){
    if (array[i] > array[m])
      m=i;
}
  return array[m];
}
public static int minval(int[] array) {
  int m= 0;
  for (int i=0; i<array.length; i++){
    if (array[i] < array[m])
      m=i;
}
  return array[m];
}
public static void binarysearch(int array[], int val){
   
if (val< array[0]){
  System.out.println( "the number above  your target is "  + array[0]);
         return;
    }
if (val> array[array.length - 1]){
  System.out.println( "the number below  your target is "  + array[array.length - 1]);
         return;
    
}
int mid = 0;
int low =0;
int high = array.length-1;
while (high>=low){
     mid = (high + low)/2;
    if (array[mid] == val){
        System.out.println( val + " was found in the list");
        return;
    }
    else if (val<array[mid]){
         high = mid - 1;
        }
    else{
         low = mid +1;
    }
}
   
         System.out.println( "the numbers above and  below your target are "  + array[mid] + " and " +array[mid-1]);
         return;
    
} 
}

