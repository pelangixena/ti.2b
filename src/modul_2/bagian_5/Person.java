package modul_2.bagian_5;

public class Person {
    private String nama;
    private int umur;

    // Default Contructor
    public Person() {
        nama = "Unknown";
        umur = 0;
    }

    // Parameterized Construstor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
    
}
