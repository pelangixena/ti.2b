package modul_3.bagian_5;

interface Terbang {
    void terbang();
}

// Abstract Class
abstract class Hewan {
    String nama;

    abstract void bersuara();
}

// Class yang mewarisi abstract class dan mengimplementasi insterface
class Burung extends Hewan implements Terbang {
    @Override
    void bersuara() {
        System.out.println("Kivau kicau!");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.nama = "Merpati";
        burung.bersuara();
        burung.terbang();
    }
}
