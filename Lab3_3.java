import java.util.Scanner;
public class Lab3_3 {
	public static void main(String[] args) {
		int toplam=1,toplam2=1;
		
		Scanner gir= new Scanner(System.in);
		System.out.print("Sayi gir");
		int sayi=gir.nextInt();
		gir.close();
		
		// For dongusu 
		for (int i=1; i<=sayi ; i++ ) {toplam*=i;}
		System.out.println("For dongusu Sonucu= "+toplam);
		
		// While dongusu
		int j=1;
		while (j<=sayi) {toplam2*=j; j++;}
		System.out.println("While dongusu Sonucu= "+toplam2);
		
	}
	

}