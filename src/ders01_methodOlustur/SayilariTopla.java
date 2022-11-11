package ders01_methodOlustur;

public class SayilariTopla {

    public static void main(String[] args) {

        //String parametreli bir method yazin ve girilen String icindeki dijitlerin toplamini dondurun

        String str= "ase1r4d3";
        System.out.println(sayilariBulTopla(str)); // 8

    } public  static  int sayilariBulTopla(String str){

        int toplam = 0;

        for (int i = 0; i < str.length() ; i++) {

           if( Character.isDigit(str.charAt(i))){
               // gelen karakterin sayi olup olmadigini kontrol eder
               toplam = toplam + Integer.valueOf("" + str.charAt(i)); // integere cevirdik, hiclik koyarak ASCİ degerleri vermesini engelledik,
               // String lestirdik


           }

        }
        return  toplam;
    }
}
