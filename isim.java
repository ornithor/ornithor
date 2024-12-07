package ISIM;
import java.util.Scanner;
public class isim {
	

	public class Main {
	    public static void main(String[] args) {
	        Scanner scn= new Scanner(System.in);
	        String[] names = new String[10];

	   
	        System.out.println("Lütfen 10 isim giriniz:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print((i + 1) + ". İsim: ");
	            names[i] = scn.nextLine();
	        }

	       
	        System.out.println("\nOrijinal Array:");
	        for (String name : names) {
	            System.out.print(name + " ");
	        }
	        System.out.println();

	        
	        System.out.print("\nGüncellemek istediğiniz elemanın indexini giriniz (0-9): ");
	        int updateIndex = scn.nextInt();
	        scn.nextLine(); 
	        System.out.print("Yeni ismi giriniz: ");
	        String newName = scn.nextLine();
	        names[updateIndex] = newName;

	        System.out.println("\nGüncellenmiş Array:");
	        for (String name : names) {
	            System.out.print(name + " ");
	        }
	        System.out.println();

	       
	        System.out.print("\nÇıkarmak istediğiniz elemanın indexini giriniz (0-9): ");
	        int removeIndex = scn.nextInt();
	        String[] updatedNames = new String[names.length - 1];
	        for (int i = 0, j = 0; i < names.length; i++) {
	            if (i != removeIndex) {
	                updatedNames[j++] = names[i];
	            }
	        }
	        names = updatedNames;

	        System.out.println("\nEleman Çıkardıktan Sonra Array:");
	        for (String name : names) {
	            System.out.print(name + " ");
	        }
	        System.out.println();

	      
	        System.out.println("\nElemanlar UPPER_CASE Şeklinde:");
	        for (String name : names) {
	            System.out.print(name.toUpperCase() + " ");
	        }
	        System.out.println();


	    }
	}

}
