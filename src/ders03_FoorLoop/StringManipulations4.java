package ders03_FoorLoop;

import java.util.Scanner;

public class StringManipulations4 {
    public static void main(String[] args) {

        /*
        kullanicidan bir kelime alin, eger ilk iki harfi "gh" ise, ilk iki harfini silin
        ilk harf g ise g yi silmeyin
        ikinci harf h ise h yi silmeyin

        input      output

        goat       gat
        photo      hoto
        ghost      ghost
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.substring(0, 2).equals("gh")) {
            System.out.println(kelime);

        } else if (kelime.substring(0, 1).equals("g")){
            System.out.println(kelime.substring(0, 1) + kelime.substring(2));
        }else if (kelime.substring(1, 2).equals("h")) {
            System.out.println(kelime.substring(1));
        } else {
            System.out.println(kelime.substring(2));
        }
    }
}
