package org.example.date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/*
        1. LocalDate
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(1992, 10, 14);
        2. LocalTime
                LocalTime now = LocalTime.now();
                LocalTime classTime = LocalTime.of(6, 30);
        3. LocalDateTime
                LocalDateTime current = LocalDateTime.now();
                LocalDateTime meeting = LocalDateTime.of(2026, 1, 3, 14, 0);
        4. ZonedDateTime
                ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
                ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        5. Instant: timestamp
                Instant now = Instant.now();
        6. Period
                Period age =
                Period.between(birthday, LocalDate.now());
                age.getYears();
        7. Duration
                Duration d = Duration.between(startTime, endTime);
                d.toMinutes();
        */
public class LocalDateExample
{
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        System.out.println("localDate "+localDate);
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfYear());
        Month month = localDate.getMonth();
        System.out.println(month.getValue());
        System.out.println("month "+month);
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.atTime(10,10));
        System.out.println(localDate.minusDays(2));
        System.out.println("localDate : "+localDate);
        localDate = localDate.minusDays(2);
        System.out.println("localDate : "+localDate);
        System.out.println(localDate.plusMonths(1));
        // LocalTime
        LocalTime localTime1 = LocalTime.now();
        System.out.println("localTime1 "+localTime1);
        LocalTime localTime2 = LocalTime.now();
        System.out.println("localTime2 "+localTime2);
        System.out.println(localTime2.plusMinutes(10));
        localTime2 = localTime2.plusMinutes(60);
        System.out.println("localTime2 "+localTime2);
        System.out.println(localTime2.compareTo(localTime1));

        System.out.println(localTime1.isAfter(localTime2));
        localTime2 = localTime2.withHour(0);
        localTime2 = localTime2.withMinute(0);
        System.out.println("localTime2 "+localTime2);
        System.out.println(localTime2.toSecondOfDay());
        System.out.println(localTime2.getNano());

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("localDateTime with new_york "+localDateTime);

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime aucklandTime = ZonedDateTime.now(ZoneId.of("Pacific/Auckland"));
        System.out.println("indiaTime "+indiaTime);
        System.out.println("usTime "+usTime);
        System.out.println("aucklandTime "+aucklandTime);

        Instant instant = Instant.now();
        System.out.println("instant getNano: "+instant.getNano());
        System.out.println("instant getEpochSecond: "+instant.getEpochSecond());

        // 2026-01-03T18:56:37
        // 03-01-2026 06:56 PM


    }
}
