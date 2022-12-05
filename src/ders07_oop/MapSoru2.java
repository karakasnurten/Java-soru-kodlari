package ders07_oop;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapSoru2 {
    public static void main(String[] args) {
        /*
        MAP Soru 3 : Count the words in a String one by one
        Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
         For Example:     Input :  String is "Ali came to school and Ayse came to school"
         Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
         */
        int sayac = 1;
        Map<String, Integer> strMap = new LinkedHashMap<>();

        String str1 = "Ali came to school and Ayse came to school";
        String[] strarr = str1.split(" ");

        for (int i = 0; i < strarr.length; i++) {
            if (strMap.containsKey(strarr[i])) {
                continue;//sadece o donguyu bıtırır tum donguye karısmaz dongu devam eder break;
                // yazılsa tum donguyu kapatıp sıstemı sonlandırır.
            } else {
                for (int j = i + 1; j < strarr.length; j++) {
                    if (strarr[j].equals(strarr[i])) {
                        sayac++;
                    }
                }
                strMap.put(strarr[i], sayac);
                sayac = 1;
            }
        }
        System.out.println(strMap);
    }
}
