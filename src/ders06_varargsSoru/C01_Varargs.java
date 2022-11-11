package ders06_varargsSoru;

public class C01_Varargs {
    public static void main(String[] args) {

        new C01_Varargs().C01_Varargs(1,"Java"); // yeni bir obje olusur // Java

        C01_Varargs obj=new C01_Varargs();
        obj.C01_Varargs(2,"Java","Guzeldir"); // "Java", "Guzeldir"



    }

    public void C01_Varargs(int a,String... b){

        System.out.print(b[b.length-a] + " "); // b[0] + "" ==> Java
    }                                          // b[2-2] + "" ==> b[0] ==> Java





}
