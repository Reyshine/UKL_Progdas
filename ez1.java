import java.util.Scanner;

public class ez1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang, lebar, tinggi, berat, dan jarak
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = scanner.nextDouble();

        // Hitung volume paket
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kilogram berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung total biaya
        double totalBiaya = berat * biayaPerKg;
        if (volume > 100) {
            totalBiaya += 50000; // Tambahan biaya untuk volume besar
        }

        // Tampilkan hasil
        System.out.printf("Biaya total pengiriman adalah: Rp %.2f%n", totalBiaya);

        scanner.close();
    }
}