import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        System.out.print("a degerini girin  ");
        int taban = gir.nextInt();

        System.out.print("b degerini girin ");
        int us = gir.nextInt();

        int sonuc = us_Al(taban, us);
        System.out.println("Sonuc: " + sonuc);

        gir.close();
    }

    public static int us_Al(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {sonuc *= taban;}
        return sonuc;
    }
}
