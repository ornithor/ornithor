package daire;
import java.util.*;
public class Daire {
	public static void main (String[]args){
	Double pi=3.14;
			Scanner scn = new Scanner(System.in);
	System.out.println("Daire alanı hesaplama uygulaması pi=" + pi);
	System.out.print("Daire'nin Yarıçapını Girin:");
	int a = scn.nextInt();
	System.out.print("Daire'nin Alanı:" + Math.pow(a, 2)* pi);
	
}
}
