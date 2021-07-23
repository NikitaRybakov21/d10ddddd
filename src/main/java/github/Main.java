package github;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Банан", "Арбуз","Огурец","Помидор","Баклажан",
                          "Арбуз","Банан","Картошка","Сливы","Банан","Перец"
        };

        Set<String> set = new HashSet<>();
        for (String s : words) {
            int sum = 0;
            for (String word : words) {
                if (s.equals(word)) sum++;
            }
            set.add(s + " " + sum + " раз");
        }
        System.out.println(set);
    }
}
