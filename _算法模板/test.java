import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        int [] a = new int[]{1,5};
        list.add(a);
        int st = list.get(0)[0], ed = list.get(0)[1];
        System.out.println(st);
        System.out.println(ed);
    }
}
