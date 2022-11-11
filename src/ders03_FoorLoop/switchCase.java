package ders03_FoorLoop;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char secenek= scan.next().charAt(0);

        switch (secenek){

            case 'A' :
            case 'a' :
                System.out.println("Java cok kolay");
                break;
            case 'B' :
                System.out.println("Java cok eglenceli");
                break;
            case 'C' :
                System.out.println("Javayi cok seviyorum");
                break;
            default:
                System.out.println("Lutfen A,B,C harflerini giriniz");


        }


    }
}
