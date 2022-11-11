package ders02_Arrays;

public class C07ArraySayininOrtadanSimetrisi {
    public static void main(String[] args) {
        // bir dizinin onden ve arkadan okunup okunmadigini kontrol etmek icin bir program yazin

        int[] a = {1,2,3,2,1};
        boolean read = true;
        int j = a.length - 1;

        for (int i = 0; i < a.length / 2; i++) {

            if (a[i] != a[j]) {
                read = false;
                break;

            } else
                j--;
        }
        System.out.println(read);


    }
}
