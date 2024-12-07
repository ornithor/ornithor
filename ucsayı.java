package ucsayı;

import java.util.Random;

public class ucsayı {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int[] sayilar = new int[3];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rastgele.nextInt(101);
        }

        int toplam = 0;
        int max = sayilar[0];
        for (int sayi : sayilar) {
            toplam += sayi;
            if (sayi > max) {
                max = sayi;
            }
        }

        double ortalama = toplam / (double) sayilar.length;

        System.out.println("Dizi: ");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
        System.out.println("\nToplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Maksimum: " + max);
    }
}