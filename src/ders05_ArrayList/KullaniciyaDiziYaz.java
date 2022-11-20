package ders05_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciyaDiziYaz {

    /*Kullanici bir uzunluk belirleyip,int elemanlari girerse
    dizinin elemanlarını sıralar ve medyan ı bulur*/
    public static void main(String[] args) {
        int uzunluk;
        int dizi[];
        Scanner scan = new Scanner(System.in);
        System.out.println("dizinin uzunlugunu girin");
        uzunluk = scan.nextInt();
        System.out.println("dizinin elwmanlarını girin");
        dizi = new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            dizi[i]= scan.nextInt();
        }
        System.out.println("medyan: "+medyan(dizi));
    }
    public static double medyan(int dizi[]){
        double medyan = 0;
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        if (dizi.length%2==1){
            medyan = dizi[dizi.length/2];
        }else {
            medyan = (dizi[dizi.length/2-1]+dizi[dizi.length/2])/2.0;
        }
        return medyan;
    }
}
