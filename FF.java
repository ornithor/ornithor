package fourcalculate;
import java.util.*;
public class FF {
	public static void main(String[]args) {
	
		
		Scanner scn = new Scanner (System.in);
		System.out.println(	"Kaç tane işlem yapacaksınız");
		int sayi = scn.nextInt();
		System.out.println(	"İşlemlerin İşaretlerini sırasıyla yazın");
		String islem = scn.next();
		for (int i= 0 ; i <sayi ; i++ ) {
			char a = islem.charAt(i);
			if(a == '+' || a =='-'|| a =='*'|| a =='/') {
				
			}
			
			
			else {
				System.out.println("yanlış girildi işlem sonlandırıldı");
				System.exit(0);
			}
			
		}
		System.out.println("1. Sayıyı girin");
		int top = scn.nextInt();
		
	
			for (int i= 0 ; i <sayi ; i++ ) {
				System.out.println("Tekrar Sayı girin");
				 int ss = scn.nextInt();
				 char b = islem.charAt(i);
				if ( b == '+') {
				System.out.println(top + ss) ;
				top = top +ss;
				}			
				
				else if (b == '-') {
					System.out.println(top - ss) ;
					top = top -ss;
				}
			
				else if (b == '*') {
					System.out.println(top * ss) ;
					top = top *ss;
			}
	
				else if (b == '/') {
					System.out.println(top / ss) ;
				
					top = top /ss;
	}
				
				
				
				
				System.out.println("Sonuç: " + top );
				 System.out.println("Çıkam için escape yazın. devam etmek için herhangi bir tuşa tıklayın");	
				 String dogru = scn.next();
				 	if (dogru == "escape" ) {
				 		System.out.println(	"İşlem sonlandırıldı");
				 		System.exit(0);
				 		
				 	}
				 			
			}
	}
}
