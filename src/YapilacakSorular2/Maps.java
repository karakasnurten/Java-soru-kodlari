package YapilacakSorular2;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    /*
    SET Sorusu - 1 - Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
    List<Integer> myList = new ArrayList<>();
    myList.add(12);
    myList.add(21);
    myList.add(12);
    myList.add(13);
    myList.add(12);
    myList.add(21);
    myList.add(35); (edited)
    Pinned by hasan kocaman
    4:28
    MAP Soru -2 : Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
    Map<String, Integer> product = new HashMap<>();
    product.put("Laptop", 12);
    product.put("TV", 53);
    product.put("Refrigerator", 12);
    product.put("Music System", 87); (edited)
    Pinned by hasan kocaman
    4:31
    SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
    Örnek: ‘Mississippi’ ´ Misp
     */


    public static void main(String[] args) {
         /*
    MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
    yazınız.
    Map<String, Integer> product = new HashMap<>();
    product.put("Laptop", 12);
    product.put("TV", 53);
    product.put("Refrigerator", 12);
    product.put("Music System", 87);
     */


        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        System.out.println(product.containsKey("Laptop"));

    }
}
