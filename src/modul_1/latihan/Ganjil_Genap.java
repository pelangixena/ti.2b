package modul_1.latihan;

import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Menentukan apakah bilangan genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        input.close();
    }
}
