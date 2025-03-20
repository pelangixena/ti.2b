package modul_3.Latihan.bagian_5;

import modul_2.latihan.bagian_5.Barang;

interface Berenang {
    void berenang();
}

// Abstract Class
abstract class HewanAir {
    String nama;

    abstract void makan();
}

// Class Ikan yang mewarisi HewanAir dan mengimplementasikan Berenang
class Ikan extends HewanAir implements Berenang {
    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Main {
    public static void main(String[] args) {
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Koi";
        ikan.berenang();
        ikan.makan();
    }
}