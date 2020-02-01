package com.mydev.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println("DATES");
        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+ today);

        // local first day of 2019
        LocalDate firstDay = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println("First Date of 2020: "+ firstDay);

        System.out.println("*************************");
        System.out.println("DIFFERENT TIME ZONES");

        LocalTime localTime = LocalTime.now();
        System.out.println("Current Local time: "+ localTime);

        LocalTime centralEuroTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Europe Local Time: "+ centralEuroTime);

        LocalTime centralUSATime = LocalTime.now(ZoneId.of("America/Chicago"));
        System.out.println("America Local Time: "+ centralEuroTime);

    }

}
