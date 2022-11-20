package ders02_Arrays;

public class ArraySayiTopla {
     /* Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
    Array  ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.*/

    public static void main(String[] args) {
        int []arr ={4,6,5,-10,8,5,20};
        int toplam =10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]+ arr[j]==toplam){
                    System.out.println(arr[i] +"+" + arr[j]+"=" + toplam);
                }

            }
            /*
    Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
    Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
    Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
    int num = 10;
    for(int i=0; i<arr.length; i++) {
    for(int j=i+1; j<arr.length; j++) {
    if(arr[i]+arr[j]==num) {
    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
    }
    }
    }
     */

        }
    }
}
