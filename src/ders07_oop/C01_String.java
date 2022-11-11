package ders07_oop;

public class C01_String {
    public static void main(String[] args) {
        String str= "java guzeldir";
        System.out.println("orjinal string: "+str);

        int val1=str.codePointAt(1);
        int val2=str.codePointAt(7);

        System.out.println("character unicode: "+ val1);
        System.out.println("character unicode: "+ val2);

        int val3=str.charAt(1);
        int val4=str.charAt(7);
        System.out.println("character: "+ str.charAt(1));
        System.out.println("character: "+ str.charAt(7));


    }


}
