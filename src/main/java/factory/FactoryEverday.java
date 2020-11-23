package factory;

import java.util.Calendar;

public class FactoryEverday {

    public static void main(String[] args) {
        Calendar cal  = Calendar.getInstance();

        System.out.println(cal);

        System.out.println(cal.get(cal.getFirstDayOfWeek()));
    }
}
