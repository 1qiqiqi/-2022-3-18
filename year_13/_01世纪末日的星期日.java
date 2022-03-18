import java.util.Calendar;

public class _01世纪末日的星期日 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        for (int year = 1999; year <1000000 ; year+=100) {
            //一百年的
            instance.set(Calendar.YEAR,year);
            instance.set(Calendar.MONTH,11);
            instance.set(Calendar.DAY_OF_MONTH,31);
            System.out.println("year :"+ year+"week: "+Calendar.DAY_OF_WEEK);
            if (instance.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(year);
                break;
            }
        }


    }
}
