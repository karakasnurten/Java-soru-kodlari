package ders03_FoorLoop;

import java.util.Scanner;

public class DiziOlustur {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayiyi alarak, bir dizi olsturun
        // bu sayilarin toplamini ve ortalamasini bulan bir program yazdirin
        int toplam;
        float ort;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz: ");
        int boyut = scan.nextInt();
        int [] dizi = new int [boyut];
        toplam =0;
        for (int i = 0; i < boyut; i++) {
            System.out.println(i+ " . eleman = ");
            dizi[i] = scan.nextInt();
            toplam+= dizi[i];
        }
        ort =(float) toplam/boyut;
        System.out.println("Toplam = " + toplam);
        System.out.println("Ortalama = " + ort);
    }
}
