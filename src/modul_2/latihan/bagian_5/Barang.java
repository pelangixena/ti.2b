package modul_2.latihan.bagian_5;

public class Barang {
    // Atribut
    String namaBarang;
    int harga;

    // Default Construstor
    public Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // Paraameterized Constructor
    public Barang(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }
}
