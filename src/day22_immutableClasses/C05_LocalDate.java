package day22_immutableClasses;

import java.time.LocalDate;

public class C05_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih); //2022-12-19
        System.out.println(tarih.getDayOfWeek());//MONDAY
        System.out.println(tarih.getMonthValue());//12
        System.out.println(tarih.getMonth());// DECEMBER
        System.out.println(tarih.getDayOfYear());// 353
        System.out.println(tarih.getChronology());// ISO

        System.out.println(tarih.withYear(2015));// 2015-12-19
        System.out.println(tarih.withDayOfMonth(15));// 2022-12-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015));//2015-12-15

        System.out.println(tarih.isLeapYear());// false

        System.out.println(tarih.minusWeeks(5));// 2022-11-14
        System.out.println(tarih.minusYears(3).minusMonths(5).minusDays(5));//2019-07-14

        System.out.println(tarih.withDayOfMonth(13).withMonth(10).minusYears(4).minusMonths(8));//2018-02-13

        LocalDate tarih1=LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);

        System.out.println(tarih1.isBefore(tarih2) ? "tarih1 daha eski" : "tarih2 daha eski");

        System.out.println(tarih1.isLeapYear());// false

        System.out.println(tarih.hashCode());// 4141843
        System.out.println(tarih1.hashCode());// 4045453


    }
}
