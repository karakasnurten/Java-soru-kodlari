package ders07_oop;

import java.util.Scanner;

public class ArmstrongSayilariYazdir {
    //1000000 dan kucuk armst sayilarını yazdıralım
    // rakamlarının küpleri toplamı sayının kendisine esit olan sayılar

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir tam sayi girin");
        int input = scan.nextInt();

        for (int i = 1; i <= input ; i++) {
            if(i== bkt(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static int bkt(int n){
        int bkt=0;
        while (n>0){
            bkt+=Math.pow(n%10,3); // sayinin rakamlarinin kupleri
            n=n/10;
        }
        return bkt;
    }

}
