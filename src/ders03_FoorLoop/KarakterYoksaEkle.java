package ders03_FoorLoop;

public class KarakterYoksaEkle {

    public static void main(String[] args) {

        String str = "aaabbbbmmmm";
        System.out.println(harfBul(str));
    }

    public static String harfBul(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {

            if (!str2.contains(str.substring(i, i + 1))) {

                str2 = str2 + str.substring(i, i + 1);


            }

        }
        return str2;

    }
}




