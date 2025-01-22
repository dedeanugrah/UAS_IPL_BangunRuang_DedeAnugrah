import java.util.Scanner;

public class BangunRuangApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Balok
        System.out.println("=== Perhitungan Balok ===");
        System.out.print("Masukkan panjang balok: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int tinggi = scanner.nextInt();

        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + balok.hitungVolume());

        // Input untuk Bola
        System.out.println("\n=== Perhitungan Bola ===");
        System.out.print("Masukkan diameter bola: ");
        int diameter = scanner.nextInt();

        Bola bola = new Bola(diameter);
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());

        scanner.close();
    }
}
