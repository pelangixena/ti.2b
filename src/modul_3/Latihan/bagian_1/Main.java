package modul_3.Latihan.bagian_1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Buku buku1 = new Buku();
        buku1.judul = "Tenggelamnya Kapal Van Der Wick";
        buku1.penulis = "Buya Hamka";
        buku1.tahunTerbit = 1938;

        // Memanggil metode
        buku1.displayInfo();
    }
}
