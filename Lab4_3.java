import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("x degerini girin: ");
        int x = gir.nextInt();
        gir.close();
        
        if (x<0)
        	fnk1(x);
        
        if (x>=0)
        	if (x<5) {
        		fnk2(x);}
        
        if (x>=5)
        	fnk3(x);
                       
    }

     static void fnk1(int x) {
    	double sonuc =Math.pow(x, 2);   		// x^2
    	System.out.println("Sonuc= "+sonuc);}
    
    
     static void fnk2(int x) {
    	double sonuc =Math.pow(x, 3);        	 // x^3
    	System.out.println("Sonuc= "+sonuc);}
    
    
     static void fnk3(int x) {
    	int sonuc=1; 
    	x-=1;                                    // (x-1)
    	for (int i = 1; i <= x; i++) {	    	 // (x-1)!
    		 sonuc *= i;}
    	System.out.println("Sonuc= "+sonuc);
    	}
}
