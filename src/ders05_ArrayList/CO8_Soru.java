package ders05_ArrayList;

import java.util.Scanner;

public class CO8_Soru {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("luften bır cumle gırınız");
        String cumle = scan.nextLine();
        char[] harfler = new char[cumle.length()];

        for (int i = 0; i < cumle.length(); i++) {
            harfler[i] = cumle.charAt(i);


        }
        int count = 0;


        System.out.println("lutfen bır harf gırınız");
        char gHarf = scan.next().charAt(0);

        for (char each : harfler
        ) {
            if (each == gHarf) {
                count++;

            }
        }

        if (count > 0) {
            System.out.println("metın harfı " + count + " kez ıcerıyor ");
        } else {
            System.out.println("harf metınde bulunamadı");
        }
    }
}
