package pazarPractise;

public class ToplamMethod {
    // Verilen string ifadenin icindeki sayilarin toplamini yazan method yapalim.
    // input= "Bu 10 islemin 20 sonucu 30 kac 40 olur."
    // output=100
    public static void main(String[] args) {
        int toplam = 0;
        String input = "Bu 10 islemin 20 sonucu 30 kac olur.";
        String yeni = "";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                yeni += input.charAt(i);
            } else {
                if (yeni.length() > 0)
                    toplam += Integer.parseInt(yeni);
                yeni = "";
            }
        }
        System.out.println(toplam);
    }
}
