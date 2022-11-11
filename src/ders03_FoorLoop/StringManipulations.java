package ders03_FoorLoop;

import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("lutfen soyisminizi girin");
        String soyisim=scan.next();

        String tamisim= isim + " "  + soyisim;

        System.out.println(tamisim.toUpperCase());
        System.out.println(tamisim); // atama yapmadigimiz icin kucuk harfle yazar
        tamisim= tamisim.toUpperCase(); // atama yaptik, buyuk harfle yazar
        System.out.println(tamisim);

        System.out.println(tamisim.substring(0, 1).toUpperCase()+ tamisim.substring(1).toLowerCase());


    }
}
