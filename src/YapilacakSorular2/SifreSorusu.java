package YapilacakSorular2;

import java.util.Scanner;

public class SifreSorusu {
    /*

 bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
1_uzunlugu => en az 10 karakter(chars) olmalidir
2_en az 1 sembol bulundurmali
3_en az 1 numara bulundurmali
4_en az buyuk harf olmalidir
5_en az bir kucuk harf olmalidir

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz : ");
        String sifre = scan.nextLine();
        char harf = scan.next().charAt(0);
        for (int i = 0; i <= 255; i++) {

            char karakter = (char) i;


            if (sifre.length() > 9) {
                System.out.println("gecersiz sifre");
            } else if (!sifre.contains("&%*!$")) {
                System.out.println("sifreyi tekrar giriniz");

            } else if (!sifre.contains("0123456789")) {
                System.out.println("yazim hatasi");

            } else if (!sifre.contains(sifre)) {
                System.out.println("sifreyi tekrar giriniz");
            }

        }


    }
}
