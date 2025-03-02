import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 10, 4, 2, 7));
        Collections.sort(numbers);
        int min = numbers.getFirst();
        int max = numbers.getLast();

        System.out.println("Dizinin en büyük sayısı: " + max);
        System.out.println("Dizinin en küçük sayısı: " + min);
    }
}
