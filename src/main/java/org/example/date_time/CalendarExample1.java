package org.example.date_time;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample1
{
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar "+calendar);
        System.out.println("calendar getTime:  "+calendar.getTime());
        calendar.setFirstDayOfWeek(Calendar.SATURDAY);
        calendar.set(2025,Calendar.APRIL,1,0,0,0);

        System.out.println("calendar getTime:  "+calendar.getTime());
        System.out.println("getFirstDayOfWeek : "+calendar.getFirstDayOfWeek());
        System.out.println("getWeekYear : "+calendar.getWeekYear());

        Calendar calendar1 = Calendar.getInstance();

        calendar1.setTimeZone(TimeZone.getTimeZone("PST"));
        System.out.println("calendar1 with PST "+calendar1);
        System.out.println("calendar1 with PST time "+calendar1.getTime());

    }
}
