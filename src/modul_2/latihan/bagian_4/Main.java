package modul_2.latihan.bagian_4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi nilai atribut menggunakan setter
        mhs1.setNama("Pelangi Xena");
        mhs1.setNim("2023573010045");

        // Menampilkan nilai atribut menggunakan getter
        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("NIM Mahasiswa: " + mhs1.getNim());
    }
}
