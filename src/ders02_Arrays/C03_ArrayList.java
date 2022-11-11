package ders02_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList {
    public static void main(String[] args) {

        List<Object> isimler = new ArrayList<>();

        isimler.add("Ali Can");
        isimler.add("Veli Yan");
        isimler.add(true);

        System.out.println(isimler);

        int[] arr = {5, 6, 7, 8};
        int[] yeniArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) ;


        yeniArr[yeniArr.length-1]=9;
        arr=yeniArr;
        System.out.println(yeniArr);


        List <String>isimler1=new ArrayList<>();
        isimler1.add( "ali");
        List <Boolean>booleans=new ArrayList<>();
        booleans.add( false);
        System.out.println(isimler1);


        Integer i=6;
        Integer i2=7;
        i.equals(i2);
        System.out.println(i);





}





    }

