import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        ArrayList<String> Kelimeler = new ArrayList<>();
        System.out.println("10 Adet Kelime Giriniz:");
        for (int i = 1; i <= 10; i++) {
            Scanner kelime = new Scanner(System.in);
            Kelimeler.add(kelime.nextLine());
        }
        Collections.sort(Kelimeler);
        System.out.println("Alfabeye göre Sıralanmış Diziniz"+Kelimeler);
    }
}
