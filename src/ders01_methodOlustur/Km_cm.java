package ders01_methodOlustur;

public class Km_cm {

    public static void main(String[] args) {
        int cmsayi=1000000000;

        System.out.println(kmvecmHesapla(cmsayi));
    }
    public static String kmvecmHesapla(int cmSayi){

        int km= cmSayi/100000;

        int m= cmSayi/100;

        String kagit= "km : " + km +"\nm : " + m;

        return kagit;


    }
}
