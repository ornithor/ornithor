package randfor;	
import java.util.*;
import java.util.random.*;
public class Rand {
	public static void main (String[]args) {
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("Ürün ismini girin");
	String urun = scn.nextLine();
		int sayı = rand.nextInt(100);
			System.out.println(urun+ "adedeti:" + sayı);
		System.out.println("Ürün fiyatını öğrenecek misiniz ? evet ise e yazın hayırsa h");
			String dogru = scn.next();		
	if (dogru.charAt(0) == 'e') {
		int fiyat = rand.nextInt(10000);
		System.out.println("Alacak mısınız? evet ise e yazın hayırsa h");
		dogru = scn.next();
		if(dogru.charAt(0) == 'e') {
			System.out.println("kaç adet alınacak Stok:" + sayı);
			int al = scn.nextInt();
			if (al <= sayı) {
				System.out.println("fiyatı: "+ al*fiyat +"\n Emin mısınız ? evet ise hayır ise h");
			dogru = scn.next();
			if (dogru.charAt(0) == 'e') {
				System.out.println("şiparişiniz verildi");
			}
			else {
				System.exit(0);
			}
			
			}
			
			else {
				System.exit(0);
			}
			
		}
		else {
			
			System.exit(0);
			
		}
	}
	else {
		System.exit(0);
	}
	
	}
	
	
}
