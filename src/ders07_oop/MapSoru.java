package ders07_oop;

import java.util.HashMap;
import java.util.Map;

public class MapSoru {
/*
    MAP Soru 3 : Count the words in a String one by one
    Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
    For Example:	  Input :  String is "Ali came to school and Ayse came to school"
    Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1

 */
public static void main(String[] args) {
    String str =  "Ali came to school and Ayse came to school";
    Map<String , Integer> myMap = new HashMap<>();

    for(String x: str.split(" ")) {
        if(!myMap.containsKey(x)){
            myMap.put(x,1);
        }else {
            myMap.replace(x,myMap.get(x)+1);

        }
    }
    System.out.println(myMap);//{school=2, Ayse=1, and=1, came=2, to=2, Ali=1}

}

}

