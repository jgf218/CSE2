//Joe Freeman
//CSE 002 
//HW 12


import java.util.Scanner;
public class Multiply{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int width1 = 0;
	int height1= 0;
	int height2 = 0;
	int width2 = 0;
for(int z = 0; z <1 ; z++){
System.out.println("Enter the width of array 1");
for(int i = 0; i<1; i++){
    if(scan.hasNextInt()){
        width1 = 0;
        width1 = scan.nextInt();
        if (width1>=0){
                continue;
        }
        else{
        System.out.println("sorry please enter an integer greater than 0" );
        i--;    
        }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        i--;
        scan.next();
    }
}
System.out.println("Enter the height of array 1");
for(int i = 0; i<1; i++){
    if(scan.hasNextInt()){
        height1 = 0;
        height1 = scan.nextInt();
        if (height1>=0){
            
                continue;
        }
        else{
        System.out.println("sorry please enter an integer greater than 0" );
        i--;    
        }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        i--;
        scan.next();
    }
}

System.out.println("Enter the height of array 2");
for(int i = 0; i<1; i++){
    if(scan.hasNextInt()){
        height2 = 0;
        height2 = scan.nextInt();
        if (height2>=0){
            
                continue;
        }
        else{
        System.out.println("sorry please enter an integer greater than 0" );
        i--;    
        }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        i--;
        scan.next();
    }
}
System.out.println("Enter the width of array 2");
for(int i = 0; i<1; i++){
    if(scan.hasNextInt()){
        width2= 0;
        width2 = scan.nextInt();
        if (width2>=0){
            
                continue;
        }
        else{
        System.out.println("sorry please enter an integer greater than 0" );
        i--;    
        }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        i--;
        scan.next();
    }
}
if (height1 == width2){

printMatrix(multiply(randomMatix(height2, width2), randomMatix(height1, width1)));
}
else{
z--;
}
}

}
public static int[][] randomMatix(int height, int width){
    int a = 1;
int[][] array = new int[height][];
for(int i = 0; i < height; i++){
    array[i] = new int  [width];
    for (int j= 0; j< width; j++){
        a = 1;
        double d = Math.random();
        if(d>.5){
            a = -1;
         }
        int c = (int) (Math.random() * 10 + 1);
        array[i][j] = c * a;
    }
}    
    return array;
    
   
}
public static int[][] multiply(int[][] array1, int[][] array2){
    int[][] array = new int[array1.length][array1.length];
    for(int i =0; i< array1.length; i++){
        for(int j =0; j< array1.length; j++){
            for(int k = 0; k< array1[0].length; k++){
                array[i][j] = array1[i][k] * array2[k][j];
            }
        }    
    }
   return array;
}
public static void printMatrix(int[][] array){
    System.out.println("{");
    for(int i = 0; i< array.length; i++){
        for( int j = 0; j < array[0].length; j++){
            System.out.print(" " + array[i][j] + " ");
        }
        System.out.println(" ");
    }
       System.out.println("}");
}
}