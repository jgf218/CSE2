// Joe Freeman
//HW02
//2/3/2015
// CSE 002 section 111


public class Arithmetic {
        // main method required for every Java program
public static void main(String[] args) {
 //Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;
double totalSockCost$;   //total cost of socks
double totalSockTax$;   //total Tax of socks
double totalGlassCost$;   //total cost of glasses
double totalGlassTax$;     // total tax of glasses
double totalEnvolopesCost$;   //total cost of envelopes
double totalEnvolopesTax$;    //total tax of envlopes bought
double totalPreTaxCost$;      // total cost pre tax
double totalTax;  //total cost of tax
double totalCost; //total cost of the order

totalEnvolopesCost$ = nEnvelopes*  envelopeCost$;
totalEnvolopesTax$ = totalEnvolopesCost$ * taxPercent;

totalGlassCost$ = nGlasses * glassCost$;
totalGlassTax$ = totalGlassCost$ * taxPercent;

totalSockCost$ = nSocks * sockCost$;
totalSockTax$ = totalSockCost$ * taxPercent;
totalPreTaxCost$ = totalSockCost$ + totalEnvolopesCost$ + totalGlassCost$;
totalTax = totalPreTaxCost$ * taxPercent;
totalCost = totalPreTaxCost$ + totalTax;

int intSock = (int) (totalSockCost$ *100);
double dblSock = (double) intSock / 100;

int intSockTax = (int) (totalSockTax$ *100);
double dblSockTax = (double) intSockTax / 100;

int intGlass = (int) (totalGlassCost$ *100);
double dblGlass = (double) intGlass / 100;

int intGlassTax = (int) (totalGlassTax$ *100);
double dblGlassTax = (double) intGlassTax / 100;

int intEnvolope = (int) (totalEnvolopesCost$ *100);
double dblEnvolope = (double) intEnvolope / 100;

int intEnvolopeTax = (int) (totalEnvolopesTax$ *100);
double dblEnvolopeTax = (double) intEnvolopeTax / 100;

int intPreTaxCost = (int) (totalPreTaxCost$ *100);
double dblPreTaxCost = (double) intPreTaxCost / 100;

int intTax = (int) (totalTax *100);
double dblTax = (double) intTax / 100;

int intCost = (int) (totalCost *100);
double dblCost= (double) intCost / 100;


 System.out.print("total sock cost was $"+dblSock);
 System.out.println(" and the tax was $" +dblSockTax);
    System.out.print("Total glasses cost was $"+dblGlass);
    System.out.println(" and the tax was $"+dblGlassTax);
    System.out.print("The total envlopes cost was $"+dblEnvolope);
    System.out.println(" and the tax was $" +dblEnvolopeTax);
     System.out.println("The total pre tax cost was $"+dblPreTaxCost);
     System.out.println("the total tax was $" +dblTax);
 System.out.println("The total cost was $"+dblCost);

}
}