import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class _SimpleDateFormat {
    public static void main(String[] args) throws InterruptedException {
        Date data = new Date();//获得日期对象
        System.out.println(new Date());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd:hh-mm-ss");
        System.out.println(ft.format(data));
        SimpleDateFormat ft1 = new SimpleDateFormat("hh-mm-ss");
        System.out.println(ft1.format(data));
        //获得时间差
        long start = System.currentTimeMillis();
        System.out.println(new Date());
        Thread.sleep(5*30*20);
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println(diff);

    }
}
