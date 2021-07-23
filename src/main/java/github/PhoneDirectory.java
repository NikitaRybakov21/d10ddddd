package github;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    static Map<String,Long> map = new HashMap<>();

    public static void main(String[] args) {
        directory();
    }
    public static void directory(){
        add("Рома",89992561122L);
        add("Валера",88005553535L);
        add("Петя",123456789123L);
        add("Рома",456535152545L);
    }
    public static void add(String name,long nam) {
       map.put(name,nam);

    }
}
