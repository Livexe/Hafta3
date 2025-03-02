import java.awt.print.Book;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] products = new String[3];
        products[0] = "Laptop";
        products[1] = "Mouse";
        products[2] = "Monitor";

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product: " + products[i]);
        }
        String[] products2 = {"Laptop", "Mouse", "Monitor"};
        //    products2[3] = "Laptop";
        // System.out.println(products2[3]);
        for (int i = 0; i < products2.length; i++) {
            System.out.println("Product: " + products2[i]);
        }
        int[] numbers = {10, 50, 60, 75};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];

        }
        System.out.println(total);
        String[] books = {"Java Giriş", "C# Programlama", "MicroServices Mimarisi"};
        String[] writers = {"Ali", "Mehmet", "Ayşe"};
        double[] prices = {99, 80, 60, 75};
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i] + ", Writer: " + writers[i] + ", Price: " + prices[i]);
        }

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("MicroServices");
        programmingLanguages.add("HTML");

        programmingLanguages.remove("Java");
        int index = programmingLanguages.indexOf("Java");
        if (index >= 0) {
            programmingLanguages.set(index, "C++");
        }

        for (String programmingLanguage : programmingLanguages) {
            System.out.println("Programming Language: " + programmingLanguage);
        }
        List<String[]> users = new ArrayList<>();
        users.add(new String[]{"Alex", "Michael", "Alex"});
        for (String[] user : users) {
            System.out.printf("User: %s\n", user);
        }
        HashMap<String, Object> products1 = new HashMap<>();
        products1.put("name", "Laptop");
        products1.put("price", "25$");
        products1.put("Stock", "12");

        products1.forEach((key, val) ->
                System.out.println(key + " : " + val));
        System.out.println("+--------------------------");
        for (String key : products1.keySet()) {
            System.out.println(key + " : " + products1.get(key));
        }
        System.out.println("--------------------------");
        for (Map.Entry<String, Object> entry : products1.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}