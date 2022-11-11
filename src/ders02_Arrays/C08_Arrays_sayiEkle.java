package ders02_Arrays;

import java.util.Arrays;

public class C08_Arrays_sayiEkle {
    // verilen bir array 'e istenen bir elemani ekleyip,
    // bize donduren bir method yazin, eski array ' e yeni degeri atayin

    public static void main(String[] args) {

       int [] abc={1,2,3,4,5,6};
       int eklenecekSayi=10;

       abc= arrayeElemanEkle(abc,eklenecekSayi);

        System.out.println(Arrays.toString(abc)); //[1, 2, 3, 4, 5, 6, 10]

    }
    public static int [] arrayeElemanEkle (int[] eklenecekArr, int eklenecekSayi){
        int[] yeniArr= new int [eklenecekArr.length+1];

        for (int i = 0; i < eklenecekArr.length; i++) {

            yeniArr[i] =eklenecekArr[i];

        }
        yeniArr[yeniArr.length-1]= eklenecekSayi;

        return yeniArr;

    }




    }



