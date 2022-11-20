package ders02_Arrays;

import java.util.Scanner;

public class KelimeSaydirma {
    // Kullanicidan bir cumle aliniz
    // verilen cumlede kac adet kelime bulundugunu yaziniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz :" );
        String cumle = scan.nextLine();
        int sayac= 1; // bosluk kelimelerin bir eksigidir

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' '){
                sayac++;

            }

        }
        System.out.println("Girilen cumlede  " + sayac + "  tane kelime bulunmaktadir.");

    }
    /*
    public class KelimeSay {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();

        System.out.println("kelimeSay2(cumle) = " + kelimeSay2(cumle));

    }
    private static int kelimeSay2 (String cumle) {

        String cumleArray[] = cumle.split(" ");
        int kelimeSayisi = cumleArray.length;
        return kelimeSayisi;
     */
}
