package ders02_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[5];
        System.out.println(sayilar);
        //array non-primitive data turudur (objedir) yazdirilamaz
        System.out.println(Arrays.toString(sayilar));

        String str = "hafta ici gunler";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));// [hafta, ici, gunler]


        String[] kelimeler2 = str.split("a");
        System.out.println(Arrays.toString(kelimeler2));// [h,  ft,  ici gunler]

        String[] kelimeler3 = str.split("ici");
        System.out.println(Arrays.toString(kelimeler3));// [hafta ,   gunler

        String[] kelimeler4 = str.split("");
        System.out.println(Arrays.toString(kelimeler4));//[h, a, f, t, a,  ,i,  g, u, n, l, e, r]


        int[] sayilar1 = {1, 2, 3, 4};


    }
}
