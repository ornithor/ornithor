package loops;
import java.util.Scanner;

public class faktoriel {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
	        int sayi = scanner.nextInt();

	        if (sayi < 0) {
	            System.out.println("Pozitif bir sayı girin.");
	        } else {
	            long faktoriyel = 1;
	            for (int i = 1; i <= sayi; i++) {
	                faktoriyel *= i;
	            }
	            System.out.println(sayi + " sayısının faktöriyel değeri: " + faktoriyel);
	        }

	        scanner.close();
	    }
}
