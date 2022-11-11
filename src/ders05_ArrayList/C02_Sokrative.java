package ders05_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Sokrative {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();

        List<String> list3 = new ArrayList<>();

        list3.add("Ayhan");

        list3.add(0,"Beyhan");

        List<String> list4 = new ArrayList<>();

        list4.add("Ayhan");

        list4.add("Beyhan");

        System.out.println(list3.equals(list4));

        System.out.println(list4.remove(0)); // [Ayhan]
        System.out.println(list4); // [Beyhan]
        System.out.println(list4.remove("Ayhan")); // false
    }
}
