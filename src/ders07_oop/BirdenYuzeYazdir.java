package ders07_oop;

public class BirdenYuzeYazdir {

    //  - Herhang! b!r döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran b!r program
    //yazınız.

    public static void main(String[] args) {
        print(0,100);

    }
    public static void print(int start,int end)
    {
        start++;
        System.out.println(start);
        if (start<end)
            print(start,end);
    }

}

