package ders07_oop;

public class try_catch {

    public static void main(String[] args) {
        try {
            çalış();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void çalış() {
        throw new RuntimeException ("Çoook çalış");
    }
    // Çoook çalış



    }

