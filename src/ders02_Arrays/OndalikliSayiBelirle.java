package ders02_Arrays;

import java.util.Scanner;

public class OndalikliSayiBelirle {
    
    /* Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
       isaretiyle yazdırmak !ç!n gereken kodu yazınız.
       Örnegin; 75.4238 ´ *4*2*3*8    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz" ); // sayiyi virgul kullanaraK verelim
        double sayi= scan.nextDouble();
        
       //  String str = "" + sayi;
        String str = String.valueOf(sayi);
        str= str.substring(str.indexOf(".") +1);
        for (int i = 0; i < str.length(); i++) {
            System.out.print("*" + str.charAt(i));        }
        /*
    1. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    for(Integer i=0; i<decimalPart.length(); i++){
    String r = decimalPart.substring(i,i+1);
    t = t + "*" + r;
    }
    System.out.println(t);
    2. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    Integer i=0;
    while(i<decimalPart.length()){
    String r = decimalPart.substring(i,i+1);
    t = t + '*' + r;
    i++;
    }
    System.out.println(t);
    3. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    Integer i=0;
    do{
    String r = decimalPart.substring(i,i+1);
    t = t + '*' + r;
    i++;
    }while(i<decimalPart.length());
    System.out.println(t);
 */
    }
}
