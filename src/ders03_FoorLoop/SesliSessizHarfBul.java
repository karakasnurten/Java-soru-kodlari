package ders03_FoorLoop;

import java.util.Scanner;

public class SesliSessizHarfBul {

    public static void main(String[] args) {

        String isim;
        int sesli=0; // sesli sayac

        Scanner scan= new Scanner(System.in);
        System.out.println("Isminizi girin : ");
        isim= scan.nextLine();

        for (int i = 0; i < isim.length(); i++) {
            char c = isim.charAt(i);
            if (c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='ö'||c=='u'||c=='ü'||c=='ı' ){
             sesli++;
            }
        }
        System.out.println("Sesli harf sayisi : " + sesli);
        System.out.println("Sessiz sayisi : " + (isim.length()-sesli));
    }
}
