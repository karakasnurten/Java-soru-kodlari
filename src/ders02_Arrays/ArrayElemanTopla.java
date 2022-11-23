package ders02_Arrays;

public class ArrayElemanTopla {

    //  Soru -4 :    * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
    //  * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
    //  * ardışık array elemanların toplamını hesaplayan bir method create ediniz. (edited)

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int toplam ;
        int adet =0;
        for (int i = 0; i < arr.length; i++) {
            adet++;
            if (adet<1){

                

            }
            for (int j = 1; j < i+1; j++) {
                System.out.println(arr[i] + "+" + arr[j] + "=" );

                }

            }

        }
    }

