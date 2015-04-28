//Joe Freeman
//April 27, 2015
// CSE 002
// lab 13


import java.util.Arrays;
public class lab13 {
    public static void main(String[] args) {
  


int[][] a = new int[5][];


for(int i = 0; i<5;i++){
    a[i] = new int[3 * i +5 ];
}
for (int i = 0; i <5; i++){
    for (int z = 0; z< a[i].length; z++ ){
        a[i][z] = (int)(Math.random() * 40 + 1);
    }
}
System.out.print("{");
for(int i = 0; i<5;i++){
    System.out.print("{");
    for(int q = 0; q<a[i].length; q++){
        System.out.print(a[i][q]+ " ");
    }
System.out.println("}");
}

System.out.println("}");
for (int i = 0; i< 5; i ++){
    Arrays.sort(a[i]);
}
System.out.print("{");
for(int i = 0; i<5;i++){
    System.out.print("{");
    for(int q = 0; q<a[i].length; q++){
        System.out.print(a[i][q]+ " ");
    }
System.out.println("}");
}

System.out.println("}");


int[][] b = new int[5][17];

for (int i = 0; i <5; i++){
    for (int z = 0; z< a[i].length; z++ ){
        b[i][z] = a[i][z];
    }
}
System.out.print("{");
for(int i = 0; i<5;i++){
    System.out.print("{");
    for(int q = 0; q<17; q++){
        System.out.print(b[i][q]+ " ");
    }
System.out.println("}");
}
}}
