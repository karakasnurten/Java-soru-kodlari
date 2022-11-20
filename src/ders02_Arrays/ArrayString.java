package ders02_Arrays;

public class ArrayString {

    // Soru : String'lerden olusan bir array2de uzunlugu en kisa ve en uzun olan elemanlari bulunuz
    // Ornek : ( Kemal, Jonathan , Mark, Angie, Veli )==> Output is Mark, Veli

    public static void main(String[] args) {

        String [] arr = { "Kemal", "Jonathan" , "Mark", "Angie", "Veli"};
        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }
            if (arr[i].length() < enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
        }
        System.out.println("enKisaKelime = " + enKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);
    }


}









