package ders01_methodOlustur;

import java.util.Scanner;

public class FibonacciSayi {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        fibonacciSerisi(sayi);
    }
    public static void fibonacciSerisi(int sayi){

        int birinciSayi= 0;
        int ikinciSayi= 1;

        if (sayi<47){
            System.out.print(birinciSayi + "-");
            System.out.print(ikinciSayi + "-");

            for (int i = 0; i < sayi ; i++) {
                int sayi3= birinciSayi+ikinciSayi; // bos kova gibi 3. sayi olusturduk

                System.out.print(sayi3 + "-");

                birinciSayi=ikinciSayi;
                ikinciSayi=sayi3;

            }
        }

    }
}
