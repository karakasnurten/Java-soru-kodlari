package ders03_FoorLoop;

public class StringManipulation2 {
    public static void main(String[] args) {

        String deger1="12.45$";
        String deger2="34.56$";

        String duzeltilmisDeger= deger1.replaceAll("\\D","");
        System.out.println(duzeltilmisDeger);
        String duzeltilmisDeger2= deger2.replaceAll("\\D","");
        System.out.println(duzeltilmisDeger2);

        String toplam= duzeltilmisDeger+duzeltilmisDeger2;
        System.out.println("toplam" + toplam);

        double sayi1= Double.parseDouble(duzeltilmisDeger)/100;
        double sayi2= Double.parseDouble(duzeltilmisDeger2)/100;

        System.out.println("sayi1" + sayi1);
        System.out.println("sayi2" + sayi2);

        double toplamDeger =sayi1 + sayi2;
        System.out.println("Toplam deger : " + toplamDeger);






    }
}
