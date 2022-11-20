package ders04_String;

import java.util.Random;

public class RandomSayi {

    public static void main(String[] args) {

        System.out.println("randomSayiUret() = " + randomSayiUret());

        System.out.println("belirliAraliktaSayiUret(low,high) = " + belirliAraliktaSayiUret(1, 23));

        System.out.println("doubleOnlyTwoDigits (48.2457) = " + doubleOnlyTwoDigits(48.2457));
        System.out.println("doubleOnlyTwoDigitsRound (48.2457) = " + doubleOnlyTwoDigitsRound(48.2457));
        System.out.println("doubleIstenenBasamak2=" + doubleIstenenBasamak("48.245756545454546565", 2));
        System.out.println("doubleIstenenBasamak3=" + doubleIstenenBasamak("48.245756554534353536565", 3));
        System.out.println("doubleIstenenBasamak4=" + doubleIstenenBasamak("48.24575653535356565", 4));
        System.out.println("doubleIstenenBasamak5=" + doubleIstenenBasamak("48.2457565653535353565", 5));
        System.out.println("doubleIstenenBasamak6 13yirmibes=" + doubleIstenenBasamak("13.2500010000000000000001", 6));
        System.out.println("doubleIstenenBasamak7=" + doubleIstenenBasamak("48.24575656535353535535565", 7));
        System.out.println("doubleIstenenBasamak8=" + doubleIstenenBasamak("48.24575656535353535535565", 8));
        System.out.println("doubleIstenenBasamak9=" + doubleIstenenBasamak("48.24575656535353535535565", 9));
        System.out.println("doubleIstenenBasamak10=" + doubleIstenenBasamak("48.24575656535353535535565", 10));
        //System.out.println("0.000000351313128975 sifir sayisi=" + kactaneSifirVar("0.000000351313128975", 9));
    }
    public static double doubleOnlyTwoDigits (double num) {
        double resultDouble = (int)((num * 100))/100.0;
        return resultDouble;
    }

    public static double doubleOnlyTwoDigitsRound (double num) {
        double resultDouble = (int)((Math.round(num) * 100))/100.0;
        return resultDouble;
    }

    public static double doubleIstenenBasamak(String str, int istenenBasamak) {
        double strtodouble = Double.parseDouble(str);
        int carpan = (int) Math.pow(10, istenenBasamak);
        double carpandouble = carpan;
        double resultDouble = (int) ((strtodouble * carpan)) / carpandouble;
        return resultDouble;
    }

    public static String randomSayiUret() {


        Random r = new Random();
        long numbers = r.nextInt(1_000_000_000)               // Last 9 digits
                + (r.nextInt(90) + 10) * 1_000_000_000L; // First 2 digits


        return ""+numbers;
    }
        // belirli bir aralikta random sayi uret

    public static String belirliAraliktaSayiUret (int low, int high){
        Random rand = new Random();

        int R = rand.nextInt(high-low) + low;

        return String.valueOf(R);

    }
}
