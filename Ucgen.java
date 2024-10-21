package ucgen;
import java.util.*;
public class Ucgen {
	public static void main (String []args) {
		Scanner scn = new Scanner(System.in);
		float h, taban ;	
			System.out.print("Üçgenin Yüksekliğini Girin:");
		h = scn.nextInt();
		    System.out.print("Üçgenin Tabanını girin :");
		taban = scn.nextInt(); 
		
		
			System.out.print("Üçgenin Alanı:"+ h*taban/2 + "\n Üçgenin Çevresi:" + taban*3);
			
			
	}
}
