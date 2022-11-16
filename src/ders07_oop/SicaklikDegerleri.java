package ders07_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SicaklikDegerleri {

    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // 100 girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Double>gununSicaklik = new ArrayList<>();

        int sonlandirmaDegeri=100;

        double girilenSicaklik = 0;
        int sayac = 0;

        do {
            System.out.println("Listeye eklemek icin bir sicaklik degeri giriniz." +
                    "\nSicaklik girisini sonlandirmak icin 100 giriniz");

            girilenSicaklik = scan.nextDouble();

            if (girilenSicaklik != sonlandirmaDegeri){

                gununSicaklik.add(girilenSicaklik);
                sayac++;

            }

        }while (girilenSicaklik !=100);{

            System.out.println("veri girisi sonlandirildi");
        }
        Collections.sort(gununSicaklik);

        System.out.println("Gunun en dusuk sicakligi :" + gununSicaklik.get(0));
        System.out.println("Gunun en yuksek sicakligi :" + gununSicaklik.get(sayac-1));





    }
}
