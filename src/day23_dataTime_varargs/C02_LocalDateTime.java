package day23_dataTime_varargs;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);

        System.out.println(ldt.getDayOfWeek());


    }
}
