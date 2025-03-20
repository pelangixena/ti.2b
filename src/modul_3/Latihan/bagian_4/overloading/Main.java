package modul_3.Latihan.bagian_4.overloading;

import modul_2.bagian_2.Kalkulator;

public class Main {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        System.out.println("Hasil 1: " + matematika.tambah(14, 14));    // Output: 28
        System.out.println("Hasil 2: " + matematika.tambah(14 ,9, 6));  // Output: 29
        System.out.println("Hasil 3: " + matematika.tambah(3.4, 2.6));  // Output: 6.0
    }
}
