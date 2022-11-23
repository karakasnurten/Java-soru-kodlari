package ders02_Arrays;

public class SayilariKarsilastir {
    public static void main(String[] args) {

        int[] arr = {1, 4, 4};
        int[] arr2 = {1, 4, 1, 4, 1};
        System.out.println(sayiKarsilastir(arr)); // false
        System.out.println(sayiKarsilastir(arr2)); // true

    }
    public static boolean sayiKarsilastir(int[] arr) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count1++;
            else if (arr[i] == 4)
                count4++;
        }
                if (count1 > count4)
                    return true;
                 else
                    return false;

                }

            }






