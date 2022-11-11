package ders02_Arrays;

import java.util.Arrays;

public class C09_Arays_binary {
    public static void main(String[] args) {

        String [] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+ " "); // apple banana grapes pears

            ;
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(fruits,"banana")); // 1
        System.out.println(Arrays.binarySearch(fruits,"z")); // -5

        }
    }
