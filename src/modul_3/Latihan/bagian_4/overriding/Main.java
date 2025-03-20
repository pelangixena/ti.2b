package modul_3.Latihan.bagian_4.overriding;

public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi: " + persegi.hitungLuas()); // Output: 16.0
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas()); // Output: 153.9
    }
}
