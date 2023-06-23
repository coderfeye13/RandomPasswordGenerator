import java.util.Random;
public class Main {
    public static void main(String[] args) {
        PasswordLengthInput giris = new PasswordLengthInput();
        giris.kullaniciGirisiniAl();
        int uzunluk = giris.getUzunluk();

        String karakterler = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$€₺∑®¥π~æß∂ƒ∆¬Ω≈√∫~µ%^&*()";
        PasswordGenerator generator = new PasswordGenerator(uzunluk, karakterler);
        String sifre = generator.sifreOlustur();

        System.out.println("Oluşturulan şifre: " + sifre);
    }
}
