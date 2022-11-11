package ders02_Arrays;

public class C04_ArrayToplam {
    public static void main(String[] args) {


        int[] arr = {1, -5, 5, -4};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                toplam += arr[i];
            }

        }
        System.out.println(toplam);
    }
}
