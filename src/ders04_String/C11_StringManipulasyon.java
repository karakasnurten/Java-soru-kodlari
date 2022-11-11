package ders04_String;

import java.util.Scanner;

public class C11_StringManipulasyon {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String tarihi = "2010/12/03";
        String tarihi2 = "2010/12/03";
        String yenitarihi = tarihi.replaceAll("\\D", "");
        String yenitarihi2 = tarihi2.replaceAll("\\D", "");
        Double tarihis1 = Double.parseDouble(yenitarihi);
        Double tarihis2 = Double.parseDouble(yenitarihi2);
        if (tarihis1 < tarihis2) {
            System.out.println("ilk girdiğiniz büyüktür.");
        } else if (tarihis1 > tarihis2) {
            System.out.println("ikinci girdiğiniz büyüktür.");
        } else {
            System.out.println("Aynı gün doğmuştur.");
        }
    }
}