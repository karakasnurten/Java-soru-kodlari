package ders02_Arrays;

import java.util.Scanner;



public class TamsayiyiStringeCevir {

    public static String[] FizzArray(int n){

        String[] sonuc = new String[n];

        for (int i = 0; i < n; i++) {
            sonuc[i] ="" +i;
        }
        System.out.println(sonuc);
        return sonuc;
    }
    public boolean tripleUp (int [] nums){
        // bir dizide ardisik sayi grubu varsa, true dondur
        for (int i = 0; i <nums.length-2 ; i++) {
            if (nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i+1] + 1)
                return  true;
        }
        return  false;

    }
    public int[] onunKati(int[] nums){
        // tenRun([2,10,3,4,20,5])===> [2,10,10,10,20,20]

        boolean onunKatiBulundu = false;
        int onunKati = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!onunKatiBulundu && (nums[i] % 10) ==0){
                onunKatiBulundu =true;
                onunKati = nums[i];
            } else if (onunKatiBulundu && nums[i] %10 !=0) {
               nums[i] = onunKati;
            } else if (onunKatiBulundu && nums[i] % 10 == 0) {
                onunKati = nums[i];

            }

        }
        return nums;
    }
    public int[] evenodd(int[] nums) {
      // evenOdd([3,2,3,2,3]) ==> [2,2,3,3,3]

        int[] sonuc = new int[nums.length];
        int baslangic = 0;
        int son = nums.length - 1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 0) {
                sonuc[baslangic] = nums[i];
                baslangic++;
            } else {
                sonuc[son] = nums[i];
                son--;
            }
        }

        return sonuc;
    }
    public  String[] fizzBuzz(int start, int end){
        String[] sonuc = new String[end-start];

        for (int i = 0; i < sonuc.length; i++) {
            int sayi =i+ start;

            if (sayi%15 ==0)
                sonuc[i] ="FizzBuzz";
            else if (sayi %3 ==0)
                sonuc[i] ="Fizz";
            else if (sayi %5 == 0)
                sonuc[i]="Buzz";
            else
                sonuc[i]="" +(i+start);
            }
        return sonuc;

        }
        public int maxSpan(int[] nums){
        // maxSpan([1,4,2,1,4,1,4])-->6 array'de ayni sayilar arasi uzakliga yayilim denir, uctaki sayilar da dahil edilir
            // maxSpan ([1,2,1,1,3])-->4
        if (nums.length == 0) // array bossa
            return 0;
        int span =1;
            for (int sol = 0; sol < nums.length; sol++) {
                for (int sag = nums.length -1; sag != sag; sag--) {
                    if (nums[sag] == nums[sol])
                        span = Math.max(span, sag-sol+1);
                }
            }
            return span;
        }
    }

