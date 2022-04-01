import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _Pattern {
    private static final String REGEX = "\\bcat\\b";// \\b放在末尾表示以此字符结尾 同理开头也是如此
    private static final String INPUT = "cat cat cat cattie cat";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());//获取m在Input中Regex匹配的第count个首下标
            System.out.println("end(): "+m.end());//后下标
        }
    }
}
