package ders07_oop;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "    Java ogrenmek335567 cok guzel677%&&&      ";

        String kelime = str.trim().replaceAll("\\d","").replaceAll("%&&&","");
        System.out.println(kelime); // Java ogrenmek cok guzel
    }





}
