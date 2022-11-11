package ders07_oop;

import java.util.Arrays;

public class PassByValue {

    public static void main(String[] args) {
        String str = "Java";
        int arr[] = {1,2,3};

        method1(str); // JAVA
        methods2(arr);
        System.out.println(Arrays.toString(arr)); // [1, 4, 3]

        methods3(arr);
        System.out.println(Arrays.toString(arr)); // [1, 4, 3]
        System.out.println(str); // Java
    }
    private  static  void methods3(int [] arr){
    int yeniArr []= {10,11,12,13};
    arr = yeniArr;
    }
    private static void methods2(int [] arr){
        arr[1] = 4;
        arr[2] =3;
    }
    private static void method1(String str){
        str = str.toUpperCase();

        // bu scope daki str JAVA olur, main method icindekini degistirmez
        System.out.println(str); // JAVA
    }
}
