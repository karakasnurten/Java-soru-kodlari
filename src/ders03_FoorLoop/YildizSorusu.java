package ders03_FoorLoop;

public class YildizSorusu {

    public static void main(String[] args) {

        int row= 3;
        int colomn= 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colomn; j++) {

                System.out.print("*  ");

            }
            System.out.println();

            // *  *  *  *  *
            // *  *  *  *  *
            // *  *  *  *  *
        }
    }



}
