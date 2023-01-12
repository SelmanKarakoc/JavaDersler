package tes;

public class day03_Q2 {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.

        //float[] numbers=new float[5];

        float[] numbers={1.0f,2.0f,3.5f,5.4f,7.0f};

        float toplam=0;

        for (int i = 0; i < numbers.length; i++) {

            toplam+=numbers[i];

        }
        System.out.println("toplam="+toplam);
    }
}
