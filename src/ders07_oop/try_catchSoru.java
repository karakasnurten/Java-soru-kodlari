package ders07_oop;

public class try_catchSoru {
    public static void main(String[] args) {
                int a= 10;
                int b =2;

        try {
            System.out.println(a/b); // 5
            try {
                Object c= a/b;
                String d= (String) c;
            }catch (ClassCastException e){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("throw keyword"); // throw keyword
        }
    }
}
