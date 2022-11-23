package ders02_Arrays;
/*
public class RandomSayi {
    import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

        import static tests.gunce.LocalDateDeneme.ayInt;
import static tests.gunce.LocalDateDeneme.gunInt;
import static tests.gunce.TarihGir.belirliAraliktaSayiUret;

        /*
           Arkadaslar sizden birkac method yazmanizi istiyorum
           Yil degiskeni icin 2013 ila 2099 arasinda random sayi uretin
           ay degiskeni icin 1 ila 12 arasinda random sayi uretin
           gun degiskeni icin 1 ila 28 arasinda random sayi uretin
           LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
           degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
           bunu yaptiktan sonra 2. bir adim daha isteyecem
           urettiginiz tarih haftasonuna veya resmi tatillere denk gelmemeli
           cozemesiniz bile lutfen yapmaya calisin ben isyerim icin bunu bir arkadasimla hazir method haline getirmistim


    public class RandomTarihAgesadaki {

        static int gunInt;
        static int ayInt;

        public static void main(String[] args) throws ParseException {
            for (int i = 0; i < 30; i++) {
                LocalDate randomDate = randomTarih();
                System.out.println("randomDate = " + randomDate);
            }

        }
        public static LocalDate randomTarih() throws ParseException {


            gunInt = new Random().nextInt(28);
            while (gunInt == 0 || gunInt > 28) {
                gunInt = new Random().nextInt(28);
            }
            ayInt = new Random().nextInt(11);
            while (ayInt == 0) {
                ayInt = new Random().nextInt(11);
            }
            String odemeTarihiGun = String.valueOf(gunInt);//1 2 3 4 5 01 02 03
            if (odemeTarihiGun.length() < 2) {
                odemeTarihiGun = "0" + odemeTarihiGun;
            }
            String odemeTarihiYil = belirliAraliktaSayiUret(2013, 2099);
            int yearRandomInt = Integer.parseInt(odemeTarihiYil);
            LocalDate localdate = LocalDate.of(yearRandomInt, ayInt, gunInt);
            List<String> holidays;
            holidays = new ArrayList<>();
            holidays.add("01-01");
            holidays.add("04-23");
            holidays.add("05-19");
            holidays.add("07-15");
            holidays.add("08-30");
            holidays.add("10-29");
            System.out.println("localdate.getDayOfWeek() = " + localdate.getDayOfWeek());
            for (String each : holidays) {
                // System.out.println("each = " + each);
                while (localdate.getDayOfWeek().toString().equals("SATURDAY") || localdate.getDayOfWeek().toString().equals("SUNDAY")
                        || localdate.toString().contains(each)) {
                    localdate = localdate.plusDays(3);
                }
            }
            System.out.println("ekledikten sonra Date: " + localdate);
            System.out.println("ekledikten sonra localdate.getDayOfWeek() = " + localdate.getDayOfWeek());
            return localdate;
        }
        public static LocalDate localDateMethod(int day, int month, int year) {
            LocalDate localdate = LocalDate.of(year, month, day);
            // print full date
            System.out.println("Date: " + localdate);
            return localdate;
        }
        */

