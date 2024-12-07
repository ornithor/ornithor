package loops;

import java.util.Random;

public class elli {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sayilar = new int[50];
        int tekSayilar = 0;
        int ciftSayilar = 0;

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(101);
        }

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                ciftSayilar++;
            } else {
                tekSayilar++;
            }
        }

        System.out.println("Çift sayılar: " + ciftSayilar);
        System.out.println("Tek sayılar: " + tekSayilar);
    }
}
