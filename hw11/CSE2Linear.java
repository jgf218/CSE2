//Joe Freeman
//CSE 002 
//HW 11 


import java.util.Scanner;
public class CSE2Linear{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int array[]=new int[15];
System.out.println("Please enter 15 students grades for CSE2: ");

for(int i = 0; i<15; i++){
    if(scan.hasNextInt()){
        int num = 0;
        num = scan.nextInt();
        if (num>=0 && num<=100){
            array[i] = num;
            if (i==0){
                continue;
            }
            if(array[i]<array[i-1]){
                System.out.println("please enter values in increasing order");
                i--;
            }
        }
        else{
        System.out.println("sorry please enter an integer between 0 and 100");
        i--;    
        }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        i--;
    }
}
String out = "The grades, sorted are: ";
  	out += listArray(array);
  	System.out.println(out);  
System.out.print("Please enter the target number: ") ;
int target = scan.nextInt();
binarysearch(array, target);
for (int z=0; z<array.length; z++) {
     target = (int) (array.length * Math.random() );
	int temp = array[target];
	array[target] = array[z];
	array[z] = temp;
	
}
out = "The grades, randomized are: ";
  	out += listArray(array);
  	System.out.println(out);  
  	System.out.print("Please enter the target number: ") ;
 target = scan.nextInt();
linear(array, target);

}  
  public static String listArray(int num[]){
	String out=" ";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=" ";
  	}
  	out+=num[j];
	}
	out+=" ";
	return out;
  }    

public static void binarysearch(int array[], int val){
    int Start = 0;
    int End = 0;
    int length = array.length;
    int c = 1;
while (true){
    length /= 2;
    if (array[length] == val){
        System.out.println( val + " was found in " + c + " itterations" );
        return;
    }
    else if (array[length]< val){
         Start = length;
         End = array.length;
        }
    else{
         Start = 0;
         End = length;
    }
    length = (Start + End);
    c++;
    if (c>array.length/2 + 1){
         System.out.println( val + " was not found in " + c + " itterations" );
         return;
    }
} 
}
public static void linear(int[] array, int target) {
  int m= 0;
  int c = 1;
  for (int i=0; i<array.length; i++){
    if (array[i] == target){
      m=i;
      System.out.println( target + " was found in " + c + " itterations" );
    }
    c++;
}
if (c>array.length + 1){
         System.out.println( target + " was not found in " + c + " itterations" );
}
return ;
}
}
