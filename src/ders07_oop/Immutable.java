package ders07_oop;



public class Immutable {

    public static void main(String[] args) {

        String s = null; // local variable null atanmali
        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

         // if(t==s)System.out.println("two"); // kirmizi cizer

        if(t.equals(s)) System.out.println("three");

        // if("Hello"==s)System.out.println("four"); // altini kirmizi cizer

        if("Hello"==t)System.out.println("five");

        // NullPointerException yazdirir


    }
}
