package ders01_methodOlustur;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2022,5,10,9,22,33);
        Period p= Period.of(3,0,2);
        System.out.println(p); // P3Y2D
        d= d.minus(p); // d objesinden periyod kadar zaman cikar
        DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm");
        System.out.println(f.format(d)); // 2019/05/08 09:22
    }



}
