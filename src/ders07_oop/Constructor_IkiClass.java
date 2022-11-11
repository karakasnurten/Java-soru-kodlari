package ders07_oop;

public class Constructor_IkiClass {

    public static int length = 0;

}
class Conslength{

    static Constructor_IkiClass cons1= new Constructor_IkiClass();
    static Constructor_IkiClass cons2 = new Constructor_IkiClass();
    static {
        System.out.println(cons1.length);
    }

    public static void main(String[] args) {
        cons1.length = 2;
        cons2.length = 8;

        System.out.println(cons1.length);

        // 0
        // 8

    }
}
