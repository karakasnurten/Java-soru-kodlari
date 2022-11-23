package ders01_methodOlustur;

import java.util.Locale;
import java.util.Scanner;

public class IsimSaklama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi girin : ");
        String isimSoyisim = scan.nextLine();
        isiMSaklama(isimSoyisim);

    }
    public static void isiMSaklama(String isim){
        String []  dizi = isim.split("\\s"); // space'e kadar ayir
        for (String s : dizi) {
            s=s.substring(0,1).toUpperCase() + s.substring(1).replaceAll("\\S","*"); // bosluk olmayanlari * yap

            System.out.println(s);
        }
    }
}
