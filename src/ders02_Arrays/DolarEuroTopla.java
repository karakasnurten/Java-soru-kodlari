package ders02_Arrays;

public class DolarEuroTopla {

    public static void main(String[] args) {

        String arr[][]={{"$12" ,"$22", "0$"}, {"€9","€40","$1"} ,{"€12","$2","$0"}};

        double toplam=0;
        String sayi="";

        double toplam2=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if ( arr[i][j].contains("$")){

                    sayi= arr[i][j].replace("$","");

                    toplam+=Double.parseDouble(sayi)*18.60;

                } else if (arr[i][j].contains("€")) {

                    sayi= arr[i][j].replace("€","");

                    toplam2+=Double.parseDouble(sayi)*19.45;
                }
            }
        }
        System.out.println("Doların toplamı :   " + toplam + "  euroların toplamı :   " + toplam2 + "  butun sayıların toplamı :   " +(toplam+toplam2) );
    }
}
