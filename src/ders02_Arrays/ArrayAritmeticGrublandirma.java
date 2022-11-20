package ders02_Arrays;

import java.util.Arrays;

public class ArrayAritmeticGrublandirma {

    // * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
    // * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     // * ardışık array elemanların toplamını hesaplayan bir method create ediniz,

        public static void main(String[] args) {
            //giriş array {3,5,1,2,7,9,2,3,5,7}

            String[] dizi1 = {"3", "5", "1", "2", "7", "9", "2", "3", "5","7"};
            AritmetikSirala(dizi1);
        }
        public static void AritmetikSirala(String[] dizi1){
            String[] dizi = new String[4];
            String yeniIndex = "";
            int indexNo=0;
            int sayac=0;
            for (int i=sayac;i<dizi.length;i++) // 4 kere dönecek, diziye eleman ekleyecek.
            {
                sayac++;
                for (int j=0;j<sayac;j++) // önce 1 kere, sonra 2 kere,3 kere 4 kere dönecek.
                {
                    yeniIndex=yeniIndex+dizi1[indexNo]+"+"; //İlk dizideki
                    indexNo++;
                }
                yeniIndex=yeniIndex.substring(0,yeniIndex.length()-1);
                dizi[i]=yeniIndex;
                yeniIndex="";
            }
            System.out.println(Arrays.toString(dizi1));
            System.out.println(Arrays.toString(dizi));

        }
}
