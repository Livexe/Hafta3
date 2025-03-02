import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        List<Integer> Numbers = new ArrayList<>();
        Scanner sayi = new Scanner(System.in);
        System.out.println("Büyükten Küçüğe Sıralamak İçin 10 Adet Sayı Giriniz");
        for (int i = 1; i <= 10; i++) {

            Numbers.add(sayi.nextInt());
        }
        Collections.sort(Numbers);
        System.out.println("Sıralanmış Diziniz"+Numbers);
    }
}
