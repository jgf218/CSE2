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
 System.out.println("Enter an int: ");
 int Val = scan.nextInt();
if(Val<0){
    return;
}
    System.out.println("the maximum of array1 is: " +maxval(array1));
System.out.println("the minimum of array1 is: " +minval(array1));

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
}