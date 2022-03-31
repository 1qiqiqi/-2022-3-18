import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _第二题不同子字符串 {
    public static void main(String[] args) {
       String s = "0100110001010001";
        HashSet<String> has = new HashSet<>();
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                String tmp = s.substring(i,j+1);
                has.add(tmp);
            }
        }
        for (String s1:has){
            System.out.println(s1);
        }
        System.out.println(has.size());
    }
}