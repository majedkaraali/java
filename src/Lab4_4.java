import java.util.Scanner;
public class Lab4_4 {
	public static void main(String[] args) {
		Scanner gir =new Scanner(System.in);
		System.out.print("n degiri girin ");
		int n=gir.nextInt();
		System.out.print("r degiri girin ");
		int r=gir.nextInt();
		gir.close();
		
		int P_sonuc= permutasyon(n,r);
		int C_sonuc= kombinasyon(n,r);
		
		System.out.println("permutasyon= "+P_sonuc + "\n" + "kombinasyon ="+C_sonuc);
		
		
		
	}
	public static int permutasyon(int n , int r) {
		
		int n_fak= faktoriyel_hesapla(n);
		int n_r_fak =faktoriyel_hesapla(n-r);
		int sonuc = n_fak / n_r_fak;
		
		return sonuc;		
	}
	
	public static int kombinasyon (int n, int r) {
		
		int n_fak= faktoriyel_hesapla(n);
		int r_fak= faktoriyel_hesapla(r);
		int n_r_fak =faktoriyel_hesapla(n-r);
		int sonuc = n_fak / (n_r_fak * r_fak);
		
		return sonuc;		

	}
	
	
	public static int faktoriyel_hesapla(int x) {
		int faktoriyel=1;
		for (int i=1 ; i<=x ; i++) {faktoriyel*=i;}
		return faktoriyel;
	}

}
