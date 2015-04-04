//Joe Freeman
//CSE 002 
//HW 10 remove elements


import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.println("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
public static int[] randomInput() {
    int[] array1 =new int[10];
    int i = 0;
    
    while (i<=9){
        array1[i] =(int) ((Math.random() *10 )+ 1);
        i++;
    } 
    
     array1[2] =(int) ((Math.random() *10)+  1);
    return array1;
    
}
public static int[] delete(int[] list, int pos){
    int[] array = new int[0];
    if (pos>9){
        System.out.println("index is not valid ");
        return array;
    }
    int i = list.length;
    int c= 0;
    int f = 0;
    int[] array2 = new int[i-1];
    while(c<=i-1){
        if (c == pos){
            c++;
            continue;
        }
        array2[f] = list[c];
        f++;
        
        c++;
    }
    return array2;
}
public static int[] remove(int[] list,  int target){
    int i = list.length;
    int c = 0;
    int repeat = 0;
    while(c<=i-1){
        if (list[c] == target){
            repeat++;
        }
        c++;
    }
    int[] array3 = new int[i-repeat];
    c=0;
    int f = 0;
     while(c<=i-1){
        if (list[c] == target){
            c++;
            continue;
        }
        array3[f] = list[c];
        f++;
        c++;
    }
   return array3; 
}
}
 

