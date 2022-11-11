package ders03_FoorLoop;

public class C08_scope_soru {
    private static int $;
    public static void main(String[] args) {
         String a_b; // deger atanmamis. main methodun icinde oldugundan local variabledir.
                     // java local variable icin deger atanmasina izin verir, fakat deger atanmadan kullanilmasina izin vermez
                     // harf, $,_ ile class ve packede ismi olabilir

        System.out.println($); // class level de defeult deger alir ve 0 deger atar

       // System.out.println(a_b); // deger atanmadigindan, kod calismaz
    }
}
