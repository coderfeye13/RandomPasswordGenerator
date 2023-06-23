import java.util.Random;

public class PasswordGenerator {
    private final int uzunluk;
    private final String karakterler;

    public PasswordGenerator(int uzunluk, String karakterler) {
        this.uzunluk = uzunluk;
        this.karakterler = karakterler;
    }

    public String sifreOlustur() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < uzunluk; i++) {
            int rastgeleIndex = random.nextInt(karakterler.length());
            char rastgeleKarakter = karakterler.charAt(rastgeleIndex);
            sb.append(rastgeleKarakter);
        }

        return sb.toString();
    }
}
