package loops;
import java.util.Scanner;

public class mail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dogruEmail = "example@gmail.com";
        String dogruSifre = "1234";
        int denemeSayisi = 0;

        while (denemeSayisi < 3) {
            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            if (email.equals(dogruEmail) && sifre.equals(dogruSifre)) {
                System.out.println("Giriş başarılı.");
                break;
            } else {
                denemeSayisi++;
                if (denemeSayisi < 3) {
                    System.out.println("Yanlış giriş. Tekrar deneyin.");
                } else {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
            }
        }
        scanner.close();
    }
}