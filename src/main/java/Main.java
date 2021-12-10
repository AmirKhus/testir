import java.util.*;

public class Main {
    public static void main(String []args){
        List<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add(String.valueOf(123));
        for (Object str : list) {
            System.out.println(str);
        }
    }
}
