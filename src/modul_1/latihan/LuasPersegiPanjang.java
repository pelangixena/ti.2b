package modul_1.latihan;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang dan lebar
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        // Menghitung luas
        int luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi panjang = " + luas);

        input.close();
    }
}
