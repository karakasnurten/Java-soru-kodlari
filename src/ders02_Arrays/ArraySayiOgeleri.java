package ders02_Arrays;

public class ArraySayiOgeleri {

    /*
    Soru -9 :String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
    o öğelerin baş harflerini alınız.
                Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM

         */
    public static void main(String[] args) {

        String[] str = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String ilkHarfler = "";
        for (int i = 0; i < str.length; i++) {
           /* if (str[i].endsWith("n") || str[i].endsWith("k")){
                ilkHarflar+=str[i].substring(0,1);
            }*/
            char chr = (str[i].charAt(str[i].length() - 1));
            if (chr == 'n' || chr == 'k') {
                ilkHarfler += str[i].charAt(0);

            }

        }
        System.out.println(ilkHarfler);
    }
}
