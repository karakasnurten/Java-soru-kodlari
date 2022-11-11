package ders05_ArrayList;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,8},{}};

        System.out.println(arr[1]); // [I@48140564 1. array 'in java referans numarasini yazar
        System.out.println(arr[1][2]); // outer array'in 1. index'inin 2. index int degeri
        System.out.println(Arrays.toString(arr[1])); // [3, 4, 5]
        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4, 5], [6, 7, 8]]
        System.out.println(arr.length); // 4

        System.out.println(arr[2].length); // [6, 7, 8]===> 3
        // System.out.println(arr[3][0]); // ArrayIndexOutOfBoundsException

    }
}
