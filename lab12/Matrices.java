//Joe Freeman
//April 10, 2015
// CSE 002
// lab 12


import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
    
    int width1 = (int) ( Math.random() * 10 + 1);
    int height1 =  (int) ( Math.random() * 10 + 1);
    boolean way = false;
    int a[][] = increasingMatrix(width1, height1, way);
    int b[][] =increasingMatrix(width1, height1, way);
    System.out.println("Generate matrix with heigth " + height1 + " and width " +width1);
    printMatrix(a, way);
     System.out.println("Generate matrix with heigth " + height1 + " and width " +width1);
    
    printMatrix(b, way);
    System.out.println("Generate matrix with heigth " + width1 + " and width " +height1);
    int c[][]  = translate(a);
    printMatrix(c, way);
    System.out.println("adding");
    printMatrix(a, way);
    System.out.println("plus");
    printMatrix(b, way);
    System.out.println("equals");
    printMatrix( addMatrix(a,b, way), way);
     System.out.println("adding");
    printMatrix(a, way);
    System.out.println("plus");
    printMatrix(c, way);
    printMatrix( addMatrix(a,c, way), way);
    
    
}

public static int[][] increasingMatrix(int width, int height, boolean format){
   int[][] array1 = new int[5][];
    int c = 0;
    if(format){
         int[][] array = new int[height][];
        for(int i = 0; i < height; i++){
            array[i] = new int  [width];
            for (int j= 0; j< width; j++){
     
                array[i][j] = c;
                 
                c++;
            }
        }
        return array;
    }
    if(!format){
        int[][] array = new int[width][];
        for(int i = 0; i < width; i++){
            array[i] = new int[height];
            for (int j= 0; j< height; j++){
                array[i][j] = c;
                c++;
                
            }
        }
        return array;
    }
    return array1;
}
public static void printMatrix(int array[][], boolean format ){
    if(format){
         for(int i = 0; i < array.length; i++){
             System.out.print("{");
            for (int j= 0; j< array[0].length; j++){
                System.out.print( array[i][j]+ " " );
            }
            System.out.println("} ");
        }
    }
    if(!format){
        
        for(int i = 0; i < array.length; i++){
           System.out.print(" {");
            for (int j= 0; j<array[0].length; j++){
                System.out.print( array[i][j] + " " );
                
            }
            System.out.println(" }");
        }
        
    }
}
public static int[][] translate(int array[][]){
    int array1[][] = new int[array[0].length][array.length];
    int c = 0;
    
        
        for(int i = 0; i < array[0].length; i++){
           
            for (int j= 0; j< array.length; j++){
                array1[i][j] = c;
                c++;
            }
        }
        return array1;
    

}
public static int[][] addMatrix(int[][] a, int[][] b, boolean formata){
    int d[][] = new int[a.length][a[0].length];
    if(a.length != b.length || a[0].length != b[0].length){
        System.out.println("The arrays cannot be added");
        System.exit(0);
    }
   
    for(int i = 0; i < a.length; i++){
           
            for (int j= 0; j< a[0].length; j++){
                d[i][j] = b[i][j] + a[i][j];
                
            }}
            return d;
}
}