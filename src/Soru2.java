import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 3, 2, 3, 1};
        HashSet<Integer> kontrol = new HashSet<>();
        HashSet<Integer> tekrar = new HashSet<>();
        for (int sayi : numbers) {
            if (!kontrol.add(sayi)) {
                tekrar.add(sayi);
            }
        }
        System.out.println("Dizi içindeki sayılar: "+kontrol);
        System.out.println("Tekrar Eden Sayılar"+tekrar);

    }
}
