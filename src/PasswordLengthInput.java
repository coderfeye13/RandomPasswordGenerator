import java.util.Scanner;

public class PasswordLengthInput {
    private int uzunluk;

    public void kullaniciGirisiniAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifre uzunluğunu girin: ");
        uzunluk = scanner.nextInt();
    }

    public int getUzunluk() {
        return uzunluk;
    }
}
