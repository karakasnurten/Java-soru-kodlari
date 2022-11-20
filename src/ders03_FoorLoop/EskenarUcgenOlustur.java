package ders03_FoorLoop;

public class EskenarUcgenOlustur {
    public static void main(String[] args) {
        // distance--; // ilk satirdan sonraki her satir basinda baslangicta belirlenen bosluk bir azaltilir ki, eskenar ucgen olsun
        // System.out.println("");
        // ucgenimizi yaparken ekran ciktisinin sol tarafindaki boslugu belirtir
        // for (int space = 0; space <=distance; space++) // bu sekilde de yapilabilir
        //System.out.print(" ");

        /*
           1
          2 2
         3 3 3
        4 4 4 4
         */

        for (int i = 1; i <=4; i++) {// satir sayisi

                for (int j =0; j <(4-i); j++) { // soluna bosluk birakir bosluk birakiyor

                    System.out.print(" ");
                }
                    for (int j=0; j<i; j++) { // i yi yazdirir sagina bir bosluk koyar
                        System.out.print( i +" ");
                    }
            System.out.println("");


                }
                   // i yi i kadar yazdirdiktan sonra bir alt satira gecer

            }



        }

