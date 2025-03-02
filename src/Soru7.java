import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Ankara", "İstanbul", "İzmir", "Bursa", "Antalya"));

        System.out.print("Bir şehir arayınız: ");
        String city = scanner.nextLine();

        boolean found = false;
        for (String a : cities) {
            if (a.equalsIgnoreCase(city)) {
                System.out.println("Aradığınız şehir bulundu: " + a);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Aradığınız şehir bulunamadı.");
        }
    }
}
