package modul_1;

public class Koleksi {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        String[] mahasiswa = {"Pelangi", "Farhatun"};
        System.out.println(number[0]);
        System.out.println(mahasiswa[0]);

        int jumlah = number.length;
        System.out.println(jumlah);

        /* long syntax for loop
        for (int i = 0; i <= number; i++) {
            //System.out.println(number[i]);
        }
        */

        // short syntax for loop
        for (int j : number ) {
            System.out.println(j);
        }
    }
}
