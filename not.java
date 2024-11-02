package notort;
import java.util.*;
public class not {
	public static void main(String[]args) {
		int vize,fin;
		
		Scanner scn = new Scanner( System.in);
		System.out.println("Vize notu girin");
		vize = scn.nextInt();
		System.out.println("Final notu girin");
		fin = scn.nextInt();
		float top = (fin*65+vize*35)/100;
		if (top >= 75 ) {
			System.out.println("Geçtiniz");
		}
		else {
		System.out.println("Kaldınız");
		}
		
		System.out.println("Not Ortalamnız ise:"+top);
		
		
	}
}
