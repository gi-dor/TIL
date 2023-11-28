package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarApp01 {

    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();
        System.out.println("현재 년도 : "+today.get(Calendar.YEAR));
        System.out.println("현재 년도 : "+today.get(Calendar.MONTH)); // 0 이 1월을 뜻함 11은 12월을 뜻함
        System.out.println("이달의 몇째 주 : "+ today.get(Calendar.WEEK_OF_MONTH));

        /**
         * 주의사항
         * Calendar.MONTH 경우 범위가 1 ~ 12 가 아닌 0 ~ 11 이다
         */

        /**
         * SimpleDateFormat
         */

        Date td = new Date();

        SimpleDateFormat sdf1, sdf2 ,sdf3;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(td));
        System.out.println(sdf2.format(td));




    }
}
