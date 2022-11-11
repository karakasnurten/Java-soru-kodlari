package ders02_Arrays;

import java.util.Arrays;

public class C06_ArraysSolaKaydir {

    public static void main(String[] args) {
        // verilen array'deki tum elemntleri bir sola kaydirip,
        // bastaki elemnti de sona tasiyacak bir method olusturun,
        // array'i yeni haliyle kaydedin


        int [] arr = {4, 5, 6, 7, 8,9};
        arr =solaKaydirmaca(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] solaKaydirmaca (int[] arr){
        int boskova = arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = boskova;
        return arr;



    }
}
