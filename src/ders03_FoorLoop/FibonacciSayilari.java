package ders03_FoorLoop;

public class FibonacciSayilari {
    public static void main(String[] args) {
        // 0 ile 1000 arasindaki Fibonacci sayilarini bulan program yaziniz.
        int a = 0;
        int b = 1;
        int c = 0;
        do {
            c = a + b;
            if (c>1000) break;
            System.out.print(c +  "-");

            a = b;
            b = c;

        } while (c < 1000) ;

        }

}
