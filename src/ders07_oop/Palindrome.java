package ders07_oop;

public class Palindrome {

    public static void main(String[] args) {

        String input = "ey edip adanada pide ye";
        boolean sonuc = palindromeKontrol(input);
        System.out.println(sonuc); // true
        String str = "1634321";
        boolean sonuc2 = palindromeKontrol(str);
        System.out.println(sonuc2); // false
    }
    private static boolean palindromeKontrol(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        } else {
            if (input.substring(0, 1).equalsIgnoreCase(input.substring(input.length() - 1))) {
               return palindromeKontrol(input.substring(1, (input.length() - 1)));
            } else {
                return false;
            }
        }

    }
}
