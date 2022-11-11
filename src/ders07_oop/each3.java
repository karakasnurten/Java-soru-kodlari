package ders07_oop;

public class each3 {
    public static void main(String[] args) {
        int arr[][] = {{12}, {21}, {13}};

        for (int[] w : arr) {

            System.out.print(w + " ");
            // [I@1554909b [I@6bf256fa [I@6cd8737 // referans no.sunu verdi

            int arr2[] = {1, 3, 5, 7, 9};

            for (int a : arr2) {

                System.out.print(a + " ");

                if (a > 4) {

                    break;

                }
            }
        }


    }
}