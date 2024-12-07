package onbessayı;
import java.util.Arrays;
import java.util.Random;

public class sayı {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int[] sayilar = new int[15];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rastgele.nextInt(100) + 1;
        }
        for(int a = 0; a < sayilar.length; a++) {
        System.out.println("Rastgele Sayılar: " + sayilar[a]);
        }
        int temp;
        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] > sayilar[j]) {
                    temp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = temp;
                }
            }
        }

        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }
}