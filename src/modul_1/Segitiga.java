package modul_1;

public class Segitiga {
    public static void main(String[] args) {
        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
            for  (int j = 1; j <= i; i++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
