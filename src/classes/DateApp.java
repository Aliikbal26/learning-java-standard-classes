package classes;

import java.util.Date;
import java.util.Calendar;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date(23587200000L);
        System.out.println(tanggal + "\n");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 15);

        Date result = calendar.getTime();
        System.out.println(result); // imprime a data atualizada: Mon Jan 15 00:
    }
}
