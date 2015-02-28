//Joe Freeman
// 2/27/15

//Lab 06 Smile


// Prgram will generate smilie faces in variety of manners

public class SmileGenerator {
                  // main method required for every Java program
                 public static void main(String[] args) {
 
                     
for( int i = 0; i<5; i++ ) {
    System.out.print(":)");  //generate 5 smilie faces
}
System.out.println(" ");
int z = 0;
while ( z < 5 ){
    System.out.print(":)"); // generate 5 more :)
    z++;   // increment z by 1
}
System.out.println(" ");

int x = 0;
do{
    System.out.print(":)"); // generate 5 more :)
    x++;   // increment x by 1
} while(x<5);
System.out.println(" ");

int randomSmile = (int) (Math.random() * 100 + 1);

int r = 0;
while(r<randomSmile){
     System.out.print(":)"); // generate 5 more :)
     r++;
}
System.out.println(" ");


int randomSmile2 = (int) (Math.random() * 100 + 1);

if (randomSmile2>30){
    randomSmile2=30;
}
int r2 = 0;
while(r2<randomSmile2){
     System.out.print(":)"); // generate 5 more :)
     r2++;
}
System.out.println(" ");
int w=1;
int t=1;
while(t<11){
    System.out.print(":)");
   
    if(t==w){
        t=0;
        w++;
        System.out.println(" ");
    }
    if(t==10){
         System.out.print(":)");
    }
     t++;
}
 System.out.println(" ");
}
}