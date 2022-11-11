package ders03_FoorLoop;

import java.util.Scanner;

public class C06_SwitchCase_soru {
    public static void main(String[] strings) {
        // hangi yil, hangi ayda kac gun var?

        Scanner input = new Scanner(System.in);

        int aydakiGunSayisi = 0;
        String ayinIsmi = "Bilinmiyor";

        System.out.print("Ayin numarasi: ");
        int ay = input.nextInt();

        System.out.print("Yilin numarasi: ");
        int yil = input.nextInt();

        switch (ay) {
            case 1:
                ayinIsmi = "Ocak";
                aydakiGunSayisi = 31;
                break;
            case 2:
                ayinIsmi= "Subat";
                if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
                    ay = 29;
                } else {
                    ay = 28;
                }
                break;
            case 3:
                ayinIsmi = "Mart";
                ay = 31;
                break;
            case 4:
                ayinIsmi = "Nisan";
                ay = 30;
                break;
            case 5:
                ayinIsmi = "Mayis";
                ay = 31;
                break;
            case 6:
                ayinIsmi = "Haziran";
                ay = 30;
                break;
            case 7:
                ayinIsmi = "Temmuz";
                ay = 31;
                break;
            case 8:
                ayinIsmi = "Agustos";
                ay = 31;
                break;
            case 9:
                ayinIsmi = "Eylul";
                ay = 30;
                break;
            case 10:
                ayinIsmi = "Ekim";
                ay = 31;
                break;
            case 11:
                ayinIsmi = "Kasim";
                ay = 30;
                break;
            case 12:
                ayinIsmi = "Aralik";
                ay = 31;
        }
        System.out.print(ayinIsmi + " " + yil + " " + ay + " gun\n");
    }
}

