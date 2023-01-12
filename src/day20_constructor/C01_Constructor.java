package day20_constructor;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();
        Toyota toyota=new Toyota();

        System.out.println(car1);
//Car{marka='Model belirtilmemiş', model='Model belirtilmemiş', yil=1900, km=0, renk='Renk seçilmemiş'}
        System.out.println(toyota);
        //day19_arrayList_forEachLoop.Toyota@4157f54e
        // toyota bir obje olduğundan özelliklerini direkt yazdıramayız, referansı yazdırı

        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";

        System.out.println(car1);




    }


    }

