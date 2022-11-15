package YapilacakSorular2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListYap {
    // Soru 2- Kullanicidan istedigi kadar isim alip,
    // Q'ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

    public static void main(String[] args) {
        System.out.println(listeOLustur());
    }

    public static List<String> listeOLustur() {

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenIsim = "";

        while (!girilenIsim.equalsIgnoreCase("q")) {

            System.out.println("Lutfen listeye eklemek icin isim giriniz. " +
                    "\nBitirmek icin q'ya basiniz ");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) {

                isimler.add(girilenIsim);

            }
        }
        return isimler;
    }





            }




