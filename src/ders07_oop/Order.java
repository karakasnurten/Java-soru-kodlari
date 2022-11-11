package ders07_oop;

public class Order {
    String m = "m";
    static  String value = "t";
    static {value += "a";} // main method'dan once statik blok calisir
    {value += "c"; } // Constructor'dan (obje olusturmadan once) once statik olmayan blok calisir

    public Order(){
        m = "h";
        value += "b";
    }
    public Order(String s){
        value += s;
        m = "k";
    }

    public static void main(String[] args) {
        Order order= new Order("f");
        order = new Order();
        System.out.println(order.value + order.m);

        // tacfcbh
    }



}
