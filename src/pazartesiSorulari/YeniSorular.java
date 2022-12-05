package pazartesiSorulari;

public class YeniSorular {
    /*
    Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak !ç!n gereken kodu yazınız.
    Örnegin; 75.4238 ´ *4*2*3*8 (edited)
    Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
    Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır. (edited)
    Soru - 3 -		ayna check sorusu:		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };		 output : verilen array simetriktir (edited)
    Soru -4 :    * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
    Soru 5 :  verilen isim ve soyismi ilk harfi buyuk        // geriye kalanlari * olacak sekilde degistirip        // bize bu halini donduren bir method olusturun        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz
    Soru 6 : verilen cumlede kelimeyi sayan bir method olusturun
    Soru 7 : String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
    Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
    Soru 8 : Task kullanicidan dogum tarihini isteyin ve gelen tarihi LocalDate clasindan bir degiskene atayin. Daha sonra kullanicidan random tarih girmesini isteyin. Random tarih dogum tarihinizden sonra ise program kabul etmesin ve kullanici yeniden tarih girsin. Sonuc olarak girilen random tarih dogum gununuzden once olmali.
    Soru -9 : String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
    alınız.
    Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
    Soru 10 : İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
    Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak !ç!n gereken kodu yazınız.
    Örnegin; 75.4238 ´ *4*2*3*8
    1. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    for(Integer i=0; i<decimalPart.length(); i++){
    String r = decimalPart.substring(i,i+1);
    t = t + "*" + r;
    }
    System.out.println(t);
    2. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    Integer i=0;
    while(i<decimalPart.length()){
    String r = decimalPart.substring(i,i+1);
    t = t + '*' + r;
    i++;
    }
    System.out.println(t);

    3. Yol:
    double num = 75.4238;
    String s = String.valueOf(num);
    int idxOfComma = s.indexOf(".");
    String decimalPart = s.substring(idxOfComma + 1);
    String t = "";
    Integer i=0;
    do{
    String r = decimalPart.substring(i,i+1);
    t = t + '*' + r;
    i++;
    }while(i<decimalPart.length());
    System.out.println(t);



     */
}
