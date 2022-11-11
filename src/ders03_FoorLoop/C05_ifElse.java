package ders03_FoorLoop;

import java.util.Scanner;

public class C05_ifElse {
    public static void main(String[] args) {

         /*Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
           dort islemden biri ile isleme koyup sonucunu yazdiriniz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi girin");
        double sayi1 = scan.nextDouble();


        System.out.println("Lutfen 2. sayiyi girin");
        double sayi2 = scan.nextDouble();

        String carpma = "*";
        String bolme = "/";
        String toplama = "+";
        String cıkarma = "-";

        System.out.println("Lutfen yapmak istediginiz islemi girin:  ");
        String islem = scan.next();

        if (islem.equals("*")) {
            System.out.println(sayi1 * sayi2);
        } else if (islem.equals("/")) {
            System.out.println(sayi1 / sayi2);

        } else if (islem.equals("+")) {
            System.out.println(sayi1 + sayi2);

        } else if (islem.equals("-")) {
            System.out.println(sayi1 - sayi2);

        } else {
            System.out.println("islemi yanlis girdiniz");

            // ya da if le yapilabilir.
            // if(secim.contains(*){


        }


    }
}

