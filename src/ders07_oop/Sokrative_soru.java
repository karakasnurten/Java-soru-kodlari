package ders07_oop;

public class Sokrative_soru {

    int sayi;

    String isim = "Ali";

    Sokrative_soru() {

        char harf = 'c';

    }

    Sokrative_soru(int sayi) {

        this.sayi = sayi;

    }

    void MyClass() {

        sayi++;

    }

    // artir(int sayi){ // method ve constracter degil, java altini cizer
    // isim++; // 2 tane compile time error vardir
    //}

}
