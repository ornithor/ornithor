package domain;
import java.util.*;
public class Domain {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Mail giriniz");
		String mail = scn.nextLine();
		boolean a = mail.contains("@gmail.com");
		System.out.println(a);
	}
}
