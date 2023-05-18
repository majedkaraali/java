import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		int a, b;
        double  x, y;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("a degerini giriniz: ");
        a = input.nextInt();
        
        System.out.print("b degerini giriniz: ");
        b = input.nextInt();
       
        System.out.print("x degerini giriniz: ");
        x = input.nextDouble();
        input.close();
        // Y  hesaplama
        y = (a * Math.pow(x, 3) * b * Math.pow(x, 2));
        
        System.out.println("y = " + y);
    }

}
