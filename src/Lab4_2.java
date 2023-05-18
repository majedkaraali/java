import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.print("Tamsayi degerini girin: ");
        int sayi = gir.nextInt();

        int faktoriyel = faktoriyelHesapla(sayi);
        System.out.println(sayi + "! = " + faktoriyel);

        gir.close();
    }

    public static int faktoriyelHesapla(int n) {
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
