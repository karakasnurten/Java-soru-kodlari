package ders03_FoorLoop;

public class charAt_int {
    // 0-255 e kadar olan harflerin, sayi ve harf degerini yazdirin

    public static void main(String[] args) {
        for (int i = 0; i <=255 ; i++) {

            char karakter = (char)i; // gelen i sayi degeri karaktere char degere cast ettik
            System.out.println(i + " char degeri : " + karakter);


        }
    }
}
