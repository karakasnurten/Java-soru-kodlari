package ders02_Arrays;

import java.util.Arrays;

public class MountainArray {
    /*
    MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod
    yazınız.
    Not:
    Mountain Array ==> [0, 2, 5, 3, 1]
    B!r array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli
    azalan deger alıyorsa Mountain Array' dir.
    Mountain Array Degil ==> [5, 2, 7, 1, 4]
    Bir array elemanları en büyük degerine kadar sürekli azalan,
    en büyük degerinden sonra sürekli artan deger alıyorsa Mounta!n Array degildir.
     */
    public static void main(String[] args) {
        int input[]={0,2,5,3,1};
        int input1[]={5,2,7,1,4};
        Arr(input);
        Arr(input1);
    }
    public static void Arr(int []arr){
        int max = arr[0];
        int index= 0;
        boolean sonuc= true;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        for (int i = 0; i <index ; i++) {
            if (arr[i]<arr[i+1]){
            }else {
                sonuc=false;
                break;
            }
        }
        if (sonuc){
            for (int i = index; i <arr.length-1 ; i++) {
                if (arr[i]>arr[i+1]){
                }else {
                    sonuc=false;
                    break;
                }
            }
        }
        if (sonuc){
            System.out.println(Arrays.toString(arr) + "--->>Mountain Array.");
        }else {
            System.out.println(Arrays.toString(arr) + "--->>>Mountain Array Değil.");
        }
    }
    }

