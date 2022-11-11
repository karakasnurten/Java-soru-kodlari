package ders03_FoorLoop;

import java.util.Scanner;

public class foorLop_soru {
    // bir harf girin. harf, sesli ise sesli oldugunu, degilse sessiz harf oldugunu yazdirin.
    // girdigi deger harf degilse ya da bir karakterden fazla ise hata mesaji gosterin

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        System.out.println("lutfen harf giriniz");

        String girilenHarf = scan.next();

        String sesliHarf= "aeiou";
        String sessizHarf =" bcdgfgjklmnprstvwyz";
        String sayilar="0123456789";
        if (girilenHarf.length()>1){
            System.out.println("Birden fazla harf girdiniz");
        }
        if (sayilar.contains(girilenHarf)){
            System.out.println("sayi girdiniz");
        }

        for (int i = 0; i < sesliHarf.length(); i++) {
            if (girilenHarf.equals(sesliHarf.substring(i,i+1))){
                System.out.println("sesli harf girdiniz");
                break;

            }
            if (girilenHarf.equals(sessizHarf.substring(i,i+1))){
                System.out.println("sessiz harf girdiniz");
                break;

            }

        }
    }

}
