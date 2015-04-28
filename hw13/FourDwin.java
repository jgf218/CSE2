//Joe Freeman
//April 27, 2015
// CSE 002
// lab 13


import java.util.Scanner;
public class FourDwin {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int x = 0;
    int y = 0;
System.out.println(" enter a value for x");   
for( int i = 0; i < 1; i++){
  if(scan.hasNextInt()){
       
     x = scan.nextInt();
    if (x>=0){
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
System.out.println(" enter a value for y");  
for (int c = 0; c < 1; c++){    
   if(scan.hasNextInt()){
       
    y = scan.nextInt();
    if (y>=x){
        continue;
    }
    else{
        System.out.println("sorry please enter an integer greater than " + x );
        c--;    
    }
        
    }
    else{
        System.out.println("sorry please enter an integer value");
        c--;
        scan.next();
    }
}

int num1 = 0, num2 = 0, num3=0;

double[][][][] a;
a = new double[3][][][];



for(int i = 0; i<3;i++){
    num1 =   (int) (y - (Math.random() * (y-x) ));
    a[i] = new double[num1][][];
    for(int q = 0; q<num1; q++){
        num2 =  (int) (y - (Math.random() * (y-x) ));
        a[i][q] = new double[num2][];
        for(int w = 0; w<num2; w++){
            num3 =  (int) (y - (Math.random() * (y-x) ));
            a[i][q][w] = new double[num3];
        }
    }
}

for(int i = 0; i<3;i++){
    for(int q = 0; q<a[i].length; q++){
        for(int w = 0; w<a[i][q].length; w++){
            for(int z = 0; z<a[i][q][w].length; z++){
            a[i][q][w][z]= ((double)((int)((Math.random() * 30 ) * 10))) / 10;
            }
        }
    }
}
  
statArray(a);
}
public static void statArray(double[][][][] a){
double sum = 0;
int count = 0;
  for(int i = 0; i<3;i++){
    for(int q = 0; q<a[i].length; q++){
        for(int w = 0; w<a[i][q].length; w++){
            for(int z = 0; z<a[i][q][w].length; z++){
            sum +=a[i][q][w][z];
            count++;
            }
        }
    }

}
double mean = sum/count;
System.out.println("the sum of the array is " +sum);
System.out.println("the mean of the array is " + mean );
System.out.println("there are " + count + " members of the array");
}
public static void printArray(double[][][][] a){
    System.out.print("{");
for(int i = 0; i<3;i++){
    System.out.print("{");
    for(int q = 0; q<a[i].length; q++){
        System.out.print("{");
        for(int w = 0; w<a[i][q].length; w++){
            System.out.print("{");
            for(int z = 0; z<a[i][q][w].length; z++){
        
            System.out.print(a[i][q][w][z]+ " ");
            }
        System.out.print("}");
        }
      System.out.print("}");
    }
 System.out.print("}");    
}
  System.out.println("}");  
}
public static double[][][][] sort4DArray(double [][][][] a){
   
    int x = 0;
    for(int i = 1; i< 3; i++){
            if(a[i].length < a[i-1].length){
                double temp[][][] = new double[a[i].length][][];
	            temp[a[i].length] = a[a[i].length];
	            a[a[i].length] = a[a[i-1].length];
	            a[a[i- 1].length] = temp[a[i].length];
                i=1;
            }
            else if (a[i].length == a[i-1].length){
                double min1 = 100, min2 = 100;
                
               
                     for(int q = 0; q<a[i].length; q++){
                         for(int w = 0; w<a[i][q].length; w++){
                             for(int z = 0; z<a[i][q][w].length; z++){
                                 if (   a[i][q][w][z]< min1){
                                     min1 = a[i][q][w][z];
                                 }
                              
                            }
                        }
                     }
                      for(int q = 0; q<a[i-1].length; q++){
                         for(int w = 0; w<a[i-1][q].length; w++){
                             for(int z = 0; z<a[i-1][q][w].length; z++){
                                 if (   a[i-1][q][w][z]< min2){
                                     min2 = a[i-1][q][w][z];
                                 }
                              
                            }
                        }
                     }
                     if(min1< min2){
                          double temp[][][] = new double[a[i].length][][];
	                       temp[a[i].length] = a[a[i].length];
	                     a[i][a[i].length] = a[a[i-1].length];
	                     a[i][a[i- 1].length] = temp[a[i].length];
                            i=1;    
                     }
            }         
}
}
}