package ders03_FoorLoop;

import java.util.Scanner;

public class IkınınKuvvetleri {

    /*Soru-11- Ikinin kuvvetleri :
       Using the Java language, have the function PowersofTwo(num) take the num parameter being passed which will be an integer
       *and return the string true if it's a power of two.
       *If it's not return the string false.
       *for example if the input is 16 then your program should return the string true
       *but if the input is 22 then the output should be the string false.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir tam sayi girin");
        int input = scan.nextInt();
        // if(input<=0) System.out.println("girilen sayi pozitif tamsayi olmali");
        System.out.println(powersofTwo(input));
    }

    public static boolean powersofTwo(int n) {
        if (n <= 0) {
            System.out.println("girilen sayi pozitif tamsayi olmali");
        } else if (n>0) {

        if (n % 2 == 0)
            return true;
        }else if (n % 2 == 1) {
            return false;
        } else {
            n=n/2;

        }
        return false;

    }
}


