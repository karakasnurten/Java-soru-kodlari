package ders05_ArrayList;

public class C07_Soru {
    public static void main(String[] args) {
        //Soru 1- âkâ harfinden âtâ harfine kadar harfleri yazdirin.

        char harf = 'k';

        do {
            System.out.print(harf + " * ");
            harf++;

        } while (harf < 't');
    }
}
