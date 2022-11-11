package ders05_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_Soru {
    public static void main(String[] args) {

    }

    public class fibonacci {
        public  void main(String[] args) {
            int num = 14;
            FibonaccıListesiYazma(num);
        }

        public  void FibonaccıListesiYazma(int count) {
            List<Integer> FibonacciListesi = new ArrayList<>();
            FibonacciListesi.add(0);
            FibonacciListesi.add(1);
            FibonacciListesi.add(1);
            int a = 0;
            int b = 1;
            int c = 1;
            for (int i = 1; i <= count; i++) {
                a = b;
                b = c;
                c = a + b;
                FibonacciListesi.add(c);
            /*
            dongu her calıstıgında su ıslemler yapılır;(suan lıstede 0,1,1 vardır)
            dongu her dondugunde;
            a=b
            b=c
            c=a+b
          örnegin :
          i=index:0       i=1       i=2       i=3      i=4  ...........  i=2..
           -----         ------    -----     -----    ----- ...........  -----
            a=0           a=1       a=1       a=2      a=3   ...........
            b=1           b=1       b=2       b=3      b=5   ...........
            c=1           c=2       c=3       c=5      c=8   ...........
           */
            }
            System.out.println(FibonacciListesi);
        }

    }
}
