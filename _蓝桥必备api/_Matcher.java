import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Matcher {
    private static String ReGex = "dog";
    private static String INPUT = "The dog says meow. "+ "All dogs say meow.";
    private static String REPLACE = "cat";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(ReGex);
        Matcher matcher = p.matcher(INPUT);
        INPUT = matcher.replaceAll(REPLACE);
        System.out.println(INPUT);
    }

}
