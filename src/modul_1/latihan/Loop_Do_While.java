package modul_1.latihan;

public class Loop_Do_While {
    public static void main(String[] args) {
        int i = 1; // Inisialisasi
        System.out.println("\nBilangan ganjil dari 1 hingga 20 (do-while loop):");

        do {
            System.out.print(i + " ");
            i += 2; // Menambah 2 untuk tetap pada bilangan ganjil
        } while (i <= 20);
    }
}
