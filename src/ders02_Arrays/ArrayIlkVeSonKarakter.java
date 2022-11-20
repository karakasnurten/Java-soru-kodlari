package ders02_Arrays;

public class ArrayIlkVeSonKarakter {
    // ilk ve son karakterleri ayni olan array ogelerini bulmak icin kod yaziniz

    public static void main(String[] args) {

        String[] isimler = {"lale","mahmut","ali","kazim","latife","mehmet","abdulbaki"};
        arama(isimler);
    }
    public static void arama (String[]names){

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if (names[i].substring(0,1).equalsIgnoreCase(names[j].substring(0,1)) && names[i].
                        substring(names[i].length()-1).equalsIgnoreCase(names[j].substring(names[j].length()-1))){
                    System.out.println(names[i]+" "+names[j]);

                }
                /*
    Soru 10 :
    İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
    String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
    int size = arr.length;
    for(Integer i=0; i<size; i++){
    String firstChar = arr[i].substring(0, 1);
    String lastChar = arr[i].substring(arr[i].length()-1);
    if(firstChar.equals(lastChar)){
    System.out.println(arr[i]);
    */

            }

        }
    }
}
