import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        int[] nilai = new int[jumlahSiswa];
        int totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
            totalNilai += nilai[i];
        }

        double rataRata = (double) totalNilai / jumlahSiswa;
        System.out.printf("Nilai rata-rata dari seluruh nilai tersebut adalah: %.2f%n", rataRata);
    }
}
