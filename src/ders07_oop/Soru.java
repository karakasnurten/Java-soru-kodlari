package ders07_oop;

public class Soru {

    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
        char ch= 'e' ;
        String name ="Sevecen"
        => Tekrar Sayisi = 3
     */

    public static void main(String[] args) {
        String metin = "Sevecen";
        char karakter = 'e';
        int tane = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (karakter == metin.charAt(i)) {
                ++tane;
            }
        }

        System.out.println("=> Tekrar Sayisi" + " = " + tane);
    }
}
