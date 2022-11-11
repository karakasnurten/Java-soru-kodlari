package ders01_methodOlustur;

import java.util.Random;
import java.util.Scanner;

public class C02_MethodOlustur {
    public static void main(String[] args) {

        int[] elemanliDizi= dizi(5);

        System.out.println(elemanliDizi[4]);

    }
    public static int[] dizi(int eleman){

        Random a= new Random();

        int[]sayilar = new int[eleman];

        for (int i = 2; i < eleman; i++) {

            sayilar[i]=a.nextInt(7);

        }
        return sayilar;
    }
}
