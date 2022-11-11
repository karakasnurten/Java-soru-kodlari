package ders06_varargsSoru;

public class C02_Varargs {

    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("ceylan");

        strBld.substring(3);

        System.out.println(strBld); // ceylan

        StringBuilder strBld1 = new StringBuilder("ceylan");

        strBld1.insert(0,"S");

        System.out.println(strBld1); // Sceylan



        String s1 ="Hurriyet";

        StringBuilder s2= new StringBuilder("Hurriyet");

        // if(s1==s2){ CTE verir altini cizer

            System.out.print("Merhaba");


        if(s1.equals(s2)) { // java izn verir, fakat bu dogru degildir

            System.out.print("Hoscakal");

        }




            StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);

            String isim="Mesut";

            sb.append(isim, 2, 4);

            sb.delete(4, 6);

            System.out.println(sb); // 12Ja45su



            StringBuilder sb1 = new StringBuilder("OCAJP8");

            sb1.subSequence(2, 4);

            sb1.deleteCharAt(3);

            sb1.reverse( );

            System.out.println(sb1); // 8PACO




        }


    }

