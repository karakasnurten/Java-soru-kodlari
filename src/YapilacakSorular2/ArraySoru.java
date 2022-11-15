package YapilacakSorular2;

public class ArraySoru {
    //Soru 4- Verilen bir array'de istenen bir elemanin
    // var olup olmadigini ve
    // varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arananEleman = 4;
        arananEleman(arr, arananEleman);
    }
    public static void arananEleman(int[] arr, int arananEleman) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananEleman) {
                sayac++;

            }
            if (sayac == 0) {
                System.out.println("Aranan sayi array de yok");
            } else {
                System.out.println("Aranan  " + arananEleman + " sayisi, array'de  " + sayac + "  kere kullanilmis");

            }
        }

    }
}



