package modul_3.Latihan.bagian_2;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setMerk("Toyoyta");
        motor1.setTahun(2006);

        System.out.println("Merk: " + motor1.getMerk());
        System.out.println("Tahun:" + motor1.getTahun());
    }
}
