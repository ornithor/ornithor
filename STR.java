package strprj;
import java.util.*;
import java.util.random.*;
public class STR {
	public static void main (String []args) {
			Scanner scn= new Scanner(System.in);
			Random rand =new Random();
		String isim,soyad,memleket, ikamet;
		char sb,ib,mb;
		int iu, su,mu ;
		System.out.println("Plaka Oluşturucu");
			System.out.print("İkamet ettiğiniz Şehrin Plaka Kodunu Girin:");
				ikamet = scn.nextLine();
			System.out.println("İsminizi Girin:");
				isim = scn.nextLine();
			System.out.print("Soyadınızı Girin:");
				soyad = scn.nextLine();
			System.out.print("Memleketinizi Girin:");
				memleket = scn.nextLine();
		ib = isim.charAt(0);
		sb = soyad.charAt(0);
		mb = memleket.charAt(0);
			iu= isim.length();
			su= soyad.length();
			mu= memleket.length();
		int rast= rand.nextInt(99);
		int carpim = iu*su*mb*rast;
		String str = Integer.toString(carpim);
		int str_uzunluk= str.length();
		System.out.println("Oluştulan Plaka:" + ikamet +" " + ib + sb + mu +" " + 	str.charAt(0)+str.charAt(1));
	}
}
