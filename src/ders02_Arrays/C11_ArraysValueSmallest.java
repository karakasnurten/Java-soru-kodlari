package ders02_Arrays;

import java.util.Scanner;

public class C11_ArraysValueSmallest {

    public static void main(String[] args) {

        // Bir dizinin en buyuk ve en kucuk uyelerini bulun

        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        int i;
        for (i = 0; i < a.length; i++)


            System.out.println("Enter the value of a :  ");



        int largest = a[0];
        int smallest = a[a.length-1];
        System.out.println(largest);



    }


    }

