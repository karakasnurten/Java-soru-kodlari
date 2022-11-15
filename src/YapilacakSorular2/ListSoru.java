package YapilacakSorular2;

import java.util.ArrayList;
import java.util.List;

public class ListSoru {
     /*
        Soru-3-Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
         */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        int arr[] = {10, 31, 15, 13, 54};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 13 && arr[i] != 15) {

                sayilar.add(arr[i]);

            }
        }
        System.out.println(sayilar);

    }
}
