package ders07_oop;

public class recursiveMethodlar {

    public static void main(String[] args) {
        int input = 5;
        int sonuc = topla(input);


    }

    private static int topla(int input) {

        if (input==1){
            return  1;
        }else {
            return  input+topla(input-1);
        }


    }


}
