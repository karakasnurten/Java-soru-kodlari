package ders03_FoorLoop;

import java.util.Scanner;

public class C04_ForLoop_soru {
    public static void main(String[] args) {


    /*
    Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4
                */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz.");

       int sayi= scan.nextInt();
        for (int k = 1; k <sayi/2 ; k++) { // k < k*k/2

            if (sayi==k*k){
                System.out.println("sayi tam karedir.");

                // if
                // for
                // main
                // class

            }

        }


    }
}

