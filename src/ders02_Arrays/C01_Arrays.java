package ders02_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] a={1,2,13,13,14};
        System.out.println(pair13(a)); // true

    }
    public static boolean pair13(int []nums){ // static koymazsak main method okumaz

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==13 && nums[i+1]==13) return true;
        } // int dizisi yan yana bir cift 13 iceriyorsa true dondurur.
        return  false;
    } // return son noktadir. return'da method turu sondaki return'la birlikte belirtilmeli
      // return yapilan degisken de return turu ile ayni olmalidir
      // void' lerde return yazilmayabilir. deger atanmadan yazilabilir


}
