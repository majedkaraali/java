import java.util.Scanner;
public class Lab1_3 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double m, v, EK;

	        System.out.print("Cismin kutlesini girin : ");
	        m = input.nextDouble();
	        System.out.print("Cismin hizini girin : ");
	        v = input.nextDouble();
	        input.close();

	        EK = 0.5 * m * Math.pow(v, 2);

	        System.out.println("Cismin kinetik enerjisi: " + EK + " joule");
	    }
}
