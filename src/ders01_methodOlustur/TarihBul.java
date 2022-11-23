package ders01_methodOlustur;

public class TarihBul {
    /*CoderByte Soru 1 : Using the Java language, have the function TimeConvert(num) take the num parameter being passed
            *  and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3).
            *
            *  Separate the number of hours and minutes with a colon.
            ==================================================================================================
            * Java dilini kullanarak, TimeConvert(num) methodunun kullanicidan integer veri tipinde num parametresini almasını sağlayın
            * ve parametrenin dönüştürdüğü saat ve dakika sayısını döndün (yani, num = 63 ise, çıktı 1:3 olmalıdır).
            *
            * Saat ve dakika sayısını iki nokta üst üste ile ayırın. Ornegin giris 126 ise output 2:6 seklinde olmalidir...

     */
    public static void main(String[] args) {

        System.out.println(zaman(126));
    }
    public static String zaman(int ti){
        String saat, min;
        if(ti < 60){
            saat = "0";
            min = Integer.toString(ti);

        }else{
            saat = Integer.toString(ti / 60);
            min = Integer.toString(ti % 60);
        }
        return saat + ":" + min;
    }



}
