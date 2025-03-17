package modul_2.latihan.bagian_2;

public class Main {
    public static void main(String[] srgas) {
        // Membuat object Lingkaran
        Lingkaran  lingkaran1 = new Lingkaran();

        // Mengatur nilai jari-jari secara manual
        lingkaran1.jariJari = 7;

        // Memanggil method hitungLuas
        double luas = lingkaran1.hitungLuas();
        System.out.println("Luas Lingkaran: " + luas);
    }
}
