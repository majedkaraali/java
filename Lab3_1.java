public class Lab3_1 {
    public static void main(String[] args) {
        int toplam = 0;
        System.out.print("Tam tek sayilar: ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
                toplam += i;
            }
        }
        System.out.println("\n");
        System.out.println("Tek sayilarin toplami= " + toplam);
    }
}