package day20_constructor;

import day20_constructor.Car;

public class C02_Constructor {
    public static void main(String[] args) {
        /*
        Bir obje oluşturulerken
        istediğimiz ozellikleri direkt atayabilirsek
        sonradan tekrar bir atama işlemi yapmama gerek kalmaz

        bu durumda atamayı tek tek bizim yapmamız yerine
        constructor ın atama yapmaısını istemeliyiz

        atama yapmak için constructor a parametre göndermeliyiz
         */
        karesiniYazdir(5);//25
        karesiniYazdir(10);//100

        Car car1=new Car("BMW","5.20",2020,15000,"Beyaz");

        System.out.println(car1);

        Car car2=new Car("Tofaş","Şahin",2010);

        System.out.println(car2);

        Car car3=new Car("Toyota","Corolla",2016,"Gri");

        System.out.println(car3);
    }

    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }
}
