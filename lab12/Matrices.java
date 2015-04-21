//Joe Freeman
//April 10, 2015
// CSE 002
// lab 12


import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int width = 5;
    int height = 3;
    boolean way = true;
    printMatrix(increasingMatrix(width, height, way), way);
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
            for (int j= 0; j< array[0].length; j++){
                System.out.print( array[i][j] );
            }
            System.out.println(" ");
        }
    }
    if(!format){
        
        for(int i = 0; i < array[0].length; i++){
           
            for (int j= 0; j<array.length; j++){
                System.out.print( array[i][j] );
                
            }
            System.out.println(" ");
        }
        
    }
}
}