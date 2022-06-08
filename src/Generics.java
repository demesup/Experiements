import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(56);
        list.add("hi");
        list.add('l');

        System.out.println(list);
    }
}
