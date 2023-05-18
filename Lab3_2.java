import java.util.Scanner;
public class Lab3_2 {
	public static void main(String[] args) {
		int a,b,toplam=1;
		Scanner gir=new Scanner(System.in);
		System.out.print("a degeri giriniz");
		a=gir.nextInt();
		System.out.print("b degeri giriniz");
		b=gir.nextInt();
		gir.close();
		for (int i=0 ; i<b ; i++) {
			toplam*=a;
			
		}
		System.out.println("Sonuc= "+toplam);
	}

}
