import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            int number = r.nextInt(100)+1;
            numbers.add(number);
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        System.out.println("Rasgele 20 Sayı"+numbers);
        System.out.println("Dizideki Çift Sayılar "+even);


    }
}
