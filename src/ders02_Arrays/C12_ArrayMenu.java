package ders02_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C12_ArrayMenu {

    static Scanner kullaniciGirdi = new Scanner(System.in);

    public static void main(String[] args) {

       /*  asgidaki secenege sahip bir menu odakli java programi hazirlayin
        a-bir dizinin ogelerini kabul et
        b-bir dizinin ogelerini goruntule
        c- kullanici tarafindan verilen dizi icindeki ogeyi arayin
        d- diziyi siralayin

       tum secenekler icin yontemler yazin. yontemler statik olmali ve bir parametre adina sahip olmalidir

        */

        System.out.println( "Array'in uzunlugunu girin : ");
        int uzunluk=kullaniciGirdi.nextInt();

        int[] list = new int[uzunluk];

        int secenek;
        do {
            System.out.println( "Menu ");
            System.out.println("1-Dizinin ogelerini kabul et ");
            System.out.println( "2-Dizinin ogelerini goruntule");
            System.out.println("3-Dizi icindeki ogeyi arayin");
            System.out.println("4-Diziyi siralayin");
            secenek=kullaniciGirdi.nextInt();

            switch (secenek) {
                case 1:
                    diziOge(list);
                    break;
                case 2:
                    diziGoruntule(list);
                    break;
                case 3:
                    System.out.println("Aramak istediginiz numarayi girin :");
                    int oge = kullaniciGirdi.nextInt();
                    int index = Arrays.binarySearch(list, oge);

                    if (index == -1) {
                        System.out.println("Oge bulunamadi");

                    } else {

                        int i;
                        System.out.println("Oge bulundu");

                    }
                    break;
                case 4:
                    System.out.println("Sirali dizi");
                    arraySirala(list);
                    diziGoruntule(list);
                    break;

            }
            }while ( secenek !=5);

    }
    static void diziOge (int[]array){

        for (int i = 0; i < array.length; i++) {
            array[i]=kullaniciGirdi.nextInt();
        }
    }
    static void diziGoruntule (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +" ");

        }
        System.out.println();
    }
    static  int arrayAra (int[]array,int sayi){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==sayi){
    return  i;
            }
        }
        return -1;
    }
    static void arraySirala(int[]array){

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length-i-1; j++) {

                if(array[j]>array[j+1]);{

                    int kucukSayi=array[j];
                    array[j]=array[j+1];
                    array[j+1]=kucukSayi;
                }

            }

        }



    }
}
