package ders02_Arrays;

public class C05_ArraysAvarageSoru {
    public static void main(String[] args) {


        double [] marks={80.5,34.5,76,98,95};
        System.out.println(getAverage(marks));
    }

    public static double getAverage(double[] arr) {

        double toplama = 0, avg = 0;
        for (int i = 0; i < arr.length; i++) {

             toplama += arr[i];

            avg =  toplama / arr.length;


        }
        return avg;
    }

}
