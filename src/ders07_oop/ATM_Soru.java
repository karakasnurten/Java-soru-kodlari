package ders07_oop;

import java.util.Scanner;

public class ATM_Soru {

    /*ATM
    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
    geri donsun.
    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

     */
    final static String kartNo = "1234567890123456"; // final degiskeni asla degistirilemez.
     static Scanner scan= new Scanner(System.in);
     static String sifre="1234";
     static double bakiye = 20000;

    public static void main(String[] args) {
        giris();

    }
    private static void giris() {
        System.out.println("Kart numarasini giriniz : ");
        String kKartNo= scan.nextLine();
        System.out.println("Sifre giriniz.");
        String kSifre=scan.next();
        kKartNo= kKartNo.replaceAll("\\s","");
        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)){
            menu();
        }else{
            System.out.println("YANLİS GİRİS YAPILDI.");
            giris();
        }
    }
    private static void menu() {
        System.out.println("***************JAVABANKA HOSGELDINIZ**********\n" +
                "YAPMAK ISTEDIGINIZ İSLEMİ SECİNİZ" +
                "1- BAKIYE SORGULA\n" +
                "2- PARA YATIRMA\n" +
                "3- PARA CEKME\n" +
                "4- PARA GONDERME\n" +
                "5- SIFRE DEGİSTİRME\n" +
                "6- CIKIS\n");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();
            }
            case 2: {
                System.out.println("YATİRILICAK MIKTARI GIRINIZ : ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);
            }
            case 3: {
                System.out.println("CEKİLECEK MIKTARI GIRINIZ : ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);
            }
            case 4: {
                System.out.println("IBAN GİRİNİZ : ");
                String iban = scan.nextLine();
                scan.nextLine();
                System.out.println("GONDERİLECEK MİKTARİ GİRİNİZ : ");
                double miktar = scan.nextDouble();

                paraGonderme(ibanKontrol(iban), miktar);
            }
            case 5: {
                sifreDegistir();
            }
            case 6: {
                System.out.println("***********HOSCAKALIN***********");
                System.exit(0); // break gibi programi bitirir.
            }
        }
    }
    private static void sifreDegistir() {
        System.out.println("SİFRENİZİ GİRİNİZ : ");
        String kSifre = scan.next();
       if(kSifre.equals(sifre)){
            System.out.println("YENİ SİFRE GİRİNİZ");
            sifre= scan.next();
            giris();
        }else{
            System.out.println("DOGRU SIFRE GİRİNİZ :");
            sifreDegistir();
        }
    }

    private static void paraGonderme(String iban, double miktar) {
        if (miktar <=bakiye){
            bakiye-=miktar;
            System.out.println(iban + "  NOLU IBANA" + miktar + "GONDERİLDİ");
            bakiyeSorgula();
        }else {
            System.out.println("GECERLİ MİKTARİ GİRİNİZ: ");
            paraGonderme(iban, scan.nextDouble());
        }
    }
    private static String ibanKontrol(String iban) {
        iban = iban.replaceAll("\\s","");
        if (iban.startsWith("TR") && iban.length() == 26){

        }else{
            System.out.println("GECERLİ İBAN GİRİNİZ : ");
            String iban2= scan.nextLine();
            ibanKontrol(iban2);
           // scan.nextLine();
           // ibanKontrol(scan.nextLine()); yukardaki 2 satir yerine sadece bu 2 satiri da yazabiliriz
        }
        return  iban;
    }
    private static void paraCekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();
        }else{
            System.out.println("GECERLİ MİKTAR GİRİNİZ");
            paraCekme(scan.nextDouble()); // tekrar paraCekme methoduyla yeni double para miktari belirlesin
        }
}
    private static void paraYatirma(double miktar){
    bakiye+=miktar;
    bakiyeSorgula();
    }
    private static void bakiyeSorgula() {
        System.out.println("BAKIYENIZ :  " + bakiye);
        menu();
    }
    }