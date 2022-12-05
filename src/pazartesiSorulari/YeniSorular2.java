package pazartesiSorulari;

import java.util.Arrays;

public class YeniSorular2 {
    /*
    Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
    Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
    Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
    int num = 10;
    for(int i=0; i<arr.length; i++) {
    for(int j=i+1; j<arr.length; j++) {
    if(arr[i]+arr[j]==num) {
    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
    }
    Soru-3 -
    ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
    /*
    Soru -9 :   String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
    alınız.
    Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
    String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
    String initials = "";
    for(String w : b){
    if(w.endsWith("n") || w.endsWith("k")){
    initials = initials + w.substring(0,1);
    }
    }
    System.out.println(initials);
     */
    /*
    Soru 10 :
    İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
    String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
    int size = arr.length;
    for(Integer i=0; i<size; i++){
    String firstChar = arr[i].substring(0, 1);
    String lastChar = arr[i].substring(arr[i].length()-1);
    if(firstChar.equals(lastChar)){
    System.out.println(arr[i]);
    }
     */

}
