package YapilacakSorular2;

import java.util.Scanner;

public class HesapMakinesi {
    /*

     Problem Tanımı :
   Basit 4 işlem yapan bir hesap makinesi kodlayınız....
   Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
   Kullanicidan iki sayi girmesini isteyiniz.
   Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
   */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz:  ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(" Yapmak istediginiz islemi seciniz :  " +
                "\n\t1. Toplama\n\t2. Cıkarma\n\t3. Carpma\n\t4. Bolme");

        char islem = scan.next().charAt(0);
        System.out.println(calculator(islem, sayi1, sayi2));

    }
    public static double calculator(char islemTipi, double sayi1, double sayi2) {
        double sonuc = 0;
        switch (islemTipi) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;

            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;

            case '/':

                sonuc = bolme(sayi1, sayi2);
                break;

        }
        return sonuc;
           }
    private static double bolme(double bolunen,double bolen) {

        if (bolen==0 && !(bolunen==0))
            return  Double.POSITIVE_INFINITY; // sayi/0 tanimsiz
            // pozitif sonsuzlugu ifade eder. Integer de yoktur. Double de vardir
        else if (bolen==0 &&  bolunen==0)
            return  Double.NaN; // 0/0 tanimsiz olarak NaN DENİR
        else  return  bolunen/bolen;



    }
}





