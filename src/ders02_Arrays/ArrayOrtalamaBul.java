package ders02_Arrays;

public class ArrayOrtalamaBul {

    public static int arrayOrtalama(int[] arr) {

        int toplam =0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            toplam= toplam +arr[i];
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

       return(toplam - (min+max))/(arr.length-2);
    }
        public static void main (String[]args){

        // int[] arr = {-10, 4, 2, 9, 12, 0}; arrayinde, max ve min sayilari cikararak
            // toplam ortalamayi bulun

            int[] arr = {-10, 4, 2, 9, 12, 0};
            System.out.println(arrayOrtalama(arr));

        }


    }


