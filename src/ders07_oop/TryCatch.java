package ders07_oop;

public class TryCatch {

    public static void main(String[] args) {
        String a=null;

        try{
            a.concat("b");
        }catch(NullPointerException e){
            a=""; // ""
        }finally{

            System.out.println("c"); // c
        }
    }
}
