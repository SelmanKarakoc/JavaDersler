package day23_dataTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1988,7,3);
        LocalDate bugun= LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas);//P34Y5M17D
        System.out.println(yas.getYears());//34

        LocalDate baslangic=LocalDate.of(2018,2,14);
        LocalDate bitis=LocalDate.of(2022,10,13);
        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure);//P4Y7M29D




    }
}
