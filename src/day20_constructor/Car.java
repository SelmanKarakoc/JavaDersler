package day20_constructor;

public class Car {

    /*
    Bir class tan oluşturulabilecek objenin ozeliiklerini
    variable veya method larla belirleyebiliriz

     */
    String marka="Model belirtilmemiş";
    String model="Model belirtilmemiş";
    int yil=1900;
    int km;
    String renk="Renk seçilmemiş";

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }


    public static void hareket(){
        System.out.println("Tüm arabalar hareket eder");
    }
    public Car(){

    }

    public Car(String mrk,String mdl, int yl,int kmetre,String rnk){
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }
/*
    Bir class ta görünür bir constructor oluşturduğumuzda
    Java default constructor ı siler
    Bu durumda daha önceden default constructor ı kullanarak
    obje oluşturan class larda CTE oluşur
    Bu tür sorunlara sebep olmamak için
    biz herhangi bir constructor oluşturduğumuzda
    bir tane de parametresiz constructor oluştururuz
     */















































































    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yil=" + yil +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }
}
