package ders07_oop;

public class ImmutableMutable {

    /*
    String class ve bu class'dan olusturulan objeler immutable'dir.
    Immutable bir object garbage collector tarafindan toplanabilir
    Immutable bir object degistirilemez
     */

    public static void main(String[] args) {
        String s= "purr";

        System.out.println(s.toUpperCase()); // PURR

        System.out.println(s.trim()); // purr

        System.out.println(s.substring(1, 3)); // ur

        s+=" two"; //en basta bir bosluk var

        System.out.println(s); // purr two

        System.out.println(s.length());


        int sayi=4;

        String isim="tuna";

        // String isim2=sayi+1; // kirmizi cizer

        // System.out.println(isim2+ " " + isim);

        System.out.println(sayi+ " " + 1);
    }
}
