import java.util.Scanner;

public class Lab2_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alisverisMiktari, nakitMiktari;

        System.out.print("Alisveris miktarini girin (TL): ");
        alisverisMiktari = scanner.nextDouble();
        System.out.print("Kasaya verilen nakit miktarini girin (TL): ");
        nakitMiktari = scanner.nextDouble();

        scanner.close();
        double paraUstu = nakitMiktari - alisverisMiktari;
        System.out.println("Para ustu: " + paraUstu + " TL");

        int[] paraBirimi = {100, 50, 20, 10, 5, 1};
        int[] adet = new int[6];

        for (int i = 0; i < 6; i++) {
            adet[i] = (int) (paraUstu / paraBirimi[i]);
            paraUstu = paraUstu % paraBirimi[i];
        }

        System.out.print("Para ustu olarak verilecek banknot adetleri: ");
        for (int i = 0; i < 6; i++) {
            if (adet[i] > 0) {
                System.out.print(adet[i] + " x " + paraBirimi[i] + " TL ");
            }
        }
    }
}
