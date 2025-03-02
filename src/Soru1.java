import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("10 Adet Numara Giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }
        int ort = total / numbers.length;
        System.out.println("Ortalama: " + ort);
        System.out.print("50den Büyük Olan Sayıların: ");
        for (int i = 0; i < numbers.length; i++) {
            if (50 < numbers[i]) {
                System.out.print(numbers[i]+ " ");
            }
        }


    }
}
