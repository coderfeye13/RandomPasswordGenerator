import java.util.Random;
import java.util.Scanner;
public class RandomPasswordGenerator {
        String karakterler = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < uzunluk; i++) {
            int rastgeleIndex = random.nextInt(karakterler.length());
            char rastgeleKarakter = karakterler.charAt(rastgeleIndex);
            sb.append(rastgeleKarakter);
        }

        String sifre = sb.toString();
        System.out.println("Oluşturulan şifre: " + sifre);
    }
