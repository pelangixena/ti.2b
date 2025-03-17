package modul_2.latihan.bagian_5;

public class Main {
    public static void main(String[] args) {
        // Membuat objek menggunakan Default Constructor
        Barang barang1 = new Barang();
        System.out.println("=== Barang 1 ===");
        barang1.tampilkanInfo();

        // Membuat objek menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop", 7500000);
        System.out.println("\n=== Barang 2 ===");
        barang2.tampilkanInfo();
    }
}
