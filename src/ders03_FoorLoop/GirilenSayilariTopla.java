package ders03_FoorLoop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GirilenSayilariTopla {

    public static void main(String[] args) {
        /*
            kullanicidan istedigi kadar sayi girmesini isteyip
            girilen sayilari toplayin
            kullanicinin islemi bitirmek icin Q'ya basmasini isteyin
            Q'ya basildiginda toplam kac sayi girdigini
            ve bu sayilarin toplaminin kac oldugunu yazdirin
         */
        girilenSayilariAdediVeToplami();
    }
    public static void girilenSayilariAdediVeToplami() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz" +
                "\n bitirmek icin Q'ya basiniz");
        double sayi = 0;
        int sayac=0;
        double toplam=0;
        sayi = scan.nextDouble();
        sayac++;
        toplam += sayi;
        System.out.println(sayac + " adet sayi girdiniz " + "bunların toplami " + toplam);

        try {

            girilenSayilariAdediVeToplami();
        } catch (InputMismatchException e) {
            String str = scan.next();
            if (str.equalsIgnoreCase("q")) {
                girilenSayilariAdediVeToplami();

            } else {
                System.out.println("bitirmek icin q harfine basmaniz gerekmektedir.");

            }

        }
    }
}
