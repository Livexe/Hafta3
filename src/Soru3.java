public class Soru3 {
    public static void main(String[] args) {
        int[] numbers = {1, -4, 5, -3, 7, 3, -1};
        int negatif=0;
        int pozitif=0;
        for (int sayi : numbers) {
            if (sayi>0) {
                pozitif += sayi;
            } else if (sayi<0) {
                negatif += sayi;
            }
        }
        System.out.println("Pozitif Sayıların Toplam: "+pozitif);
        System.out.println("Negatif Sayıların Toplam: "+negatif);

    }
}
