package org.example.date_time;

/*
        Date: util, sql
        Calendar
        LocalDate
        LocalTime
        LocalDateTime



        Time: DD/MM/YYYY HH:MM:SS Milliseconds
        1000 millis : 1 second :  1 - 1000
        60 second : 1 minute : 0 - 59
        60 minute : 1 hour   : 0-59
        24 hour: 1 day      1 - 30

        Time Zone:
        IST
        GMT
        UTC
        UK
 */

import java.util.Date;

public class DateTimeExample1
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(" date : "+date);
        System.out.println(" date timestamp : "+date.getTime());
        date.setDate(date.getDate() + 1);
        //date.setTime(0);
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);
        date.setMonth(11);
        System.out.println(" date : "+date);

        // 01-Apr-2025
        Date startDate = new Date();
        startDate.setMonth(3);
        startDate.setDate(1);
        startDate.setYear(startDate.getYear() - 2);
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);

        System.out.println(" startDate : "+startDate);
        Date endDate = new Date();
        endDate.setMonth(2);
        endDate.setDate(31);
        endDate.setYear(endDate.getYear() - 1);
        endDate.setHours(23);
        endDate.setMinutes(59);
        endDate.setSeconds(59);

        System.out.println(" endDate : "+endDate);
    }
}
