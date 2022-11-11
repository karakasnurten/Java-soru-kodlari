package ders01_methodOlustur;

public class C01_MethodOlustur {
    // public access modifier, long return type, int x method parantezi
    public  static long square (int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }
    public static void main(String[] args) {
        int value =9;
        long result = square( value);
        System.out.println(value);
        // 9 yazdirir

    }
    public void methodA(){ return;}
    // public void methodB(){ return null;}
    public void methodC(){}

    public  int methodD(){return 9;}
    // public int methodE(){return 9.0;}
    // public int methodF(){return;}
    // public int methodH({return  null;})


}
