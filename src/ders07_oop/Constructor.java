package ders07_oop;

public class Constructor {

    int x=10 , y ;
    Constructor(){ //Default access modifier var, sadece bu package'den ulasilabilir
        System.out.println(x*y);
    }
    Constructor(int x , int y){
        this();
        this.x=x;
        this.y=10;
        System.out.println(x*y);
    }
    Constructor(int x, int y, int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.println(x*z);
    }

    public static void main(String[] args) {
        Constructor cons= new Constructor(3,4,5);
        System.out.println(cons.x * cons.y);

        // 0
        // 20
        // 15
        // 12


    }
}
