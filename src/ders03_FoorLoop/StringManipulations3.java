package ders03_FoorLoop;

import java.util.Scanner;

public class StringManipulations3 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen birinci kelimeyi giriniz");
        String kelime1= scan.next();

        System.out.println("lutfen ikinci kelimeyi giriniz");
        String kelime2= scan.next();

        System.out.println("lutfen ucuncu kelimeyi giriniz");
        String kelime3= scan.next();

        String duzeltilmisKelime1= kelime1.substring(0,1).toUpperCase()+ kelime1.substring(1).toLowerCase();
        String duzeltilmisKelime2= kelime2.toLowerCase();
        String duzeltilmisKelime3= kelime3.toLowerCase() + ".";
        System.out.println(duzeltilmisKelime1 +" " + duzeltilmisKelime2 + " " + duzeltilmisKelime3);


    }

}
