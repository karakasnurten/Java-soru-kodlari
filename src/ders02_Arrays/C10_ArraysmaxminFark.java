package ders02_Arrays;

import java.util.Scanner;

public class C10_ArraysmaxminFark {


    public static void maxsayi(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("max :  " + max);

    }
    public static void minsayi(int[] arr) {

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("min :  " + min);

    }
    public static void main(String[] args) {

        /*
        kullanici tarafindan bir tamsayi dizisi alin
        tum oge ciftleri arasinda max. ve min. farka sahip olan
         oge ciftini bulmak icin bir program yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int boyut = scan.nextInt();
        int[] arr = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print("Sayıları giriniz: ");
            int sayi = scan.nextInt();
            arr[i] = sayi;

        }
        maxsayi(arr);
        minsayi(arr);



    }
}



