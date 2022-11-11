package ders01_methodOlustur;

import java.util.Arrays;

public class C03_MethodOlustur {
    public static void main(String[] args) {

        System.out.println(new6(5)); //[I@48140564
    }
    public static int[] new6(int n){

        int[] result= new int[n];

        for (int i = 0; i < result.length; i++) {

            result[i]=6;
            System.out.println(result);

        }
        return  result;
    }
}
