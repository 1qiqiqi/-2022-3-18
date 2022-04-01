import java.util.Calendar;
import java.util.GregorianCalendar;

public class _Calender {
    public static void main(String[] args) {
        //Calendar是抽象类
        Calendar cal = Calendar.getInstance();
        //set方法设置Calendar的各种属性 比如
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,31);
        //get方法获取cal的属性值
        for (int i=1999;i<1000000;i+=100){
            cal.set(Calendar.YEAR,i);
            cal.set(Calendar.MONTH,11);
            cal.set(Calendar.DAY_OF_MONTH,31);
            if (cal.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(i);
                break;}
        }
        int i = cal.get(Calendar.MONTH);
        System.out.println(i);
        //add方法
        cal.add(Calendar.MONTH,-2);//这个cal对象的属性改变 增加-2个月
        System.out.println(cal.get(Calendar.MONTH));
        //判断是否为瑞年的一个类
        GregorianCalendar gre = new GregorianCalendar();
        if (gre.isLeapYear(2021)){
            System.out.println("是的");
        }else{
            System.out.println("不是的");
        }
    }
}