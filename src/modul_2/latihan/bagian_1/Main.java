package modul_2.latihan.bagian_1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Buku
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.judul = "Tenggelamnya Kapal Van Der Wick";
        buku1.pengarang = "Buya Hamka";

        // Menampilkan nilai atribut
        System.out.println("Judul: " + buku1.judul);
        System.out.println("Pengarang: " + buku1.pengarang);

    }
}
