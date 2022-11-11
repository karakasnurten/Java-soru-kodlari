package ders03_FoorLoop;

public class C01_forloop {
    public static void main(String[] args) {
        // 1 den 100 e kadar (100dahil) olan tamsayilari toplayin
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            // once bir defa baslangica bakar toplam 0. sonra artis miktarina ,
            // sonrada toplamin olmasi gereken degerine bakar. yani i <=100
            toplam += i;
        }
        System.out.println(toplam);
        // toplam degeri konsolda gorelim

        // verilen iki sayinin ilkinden baslayip ikinciye kadar,
        // 3 er 3 er yazdirin ( ikinci sayi sartlari saglamiyorsa yazdirmayabilir)

        int bas = 20;
        int bitis = 100;
        for (int i = bas; i <= bitis; i += 3) {
            System.out.print(i + " "); // yan yana olmasi icin print olaraka yazdik
        }
        System.out.println("");// "" eklersek bir alt satira gecer

        // verilen sayidan baslayarak geriye 1 e dogru
        // 3 ile bolunebilen sayilari yazdirin

        int input = 100;
        for (int i = 100; i >= 1; i--) { // { yazmazsak if li degeri ignore eder
            if (i % 3 == 0) {
                System.out.print(i + " "); // yan yana olamsi icin yaptik


            }
        }
    }
}

