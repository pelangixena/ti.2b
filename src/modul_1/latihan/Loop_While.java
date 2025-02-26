package modul_1.latihan;

public class Loop_While {
    public static void main(String[] args) {
        int i = 1; // Inisialisasi
        System.out.println("\nBilangan ganjil dari 1 hingga 20 (while loop):");

        while (i <= 20) {
            System.out.print(i + " ");
            i += 2; // Menambah 2 untuk tetap pada bilangan ganjil
        }
    }
}
