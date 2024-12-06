import java.util.Scanner;
import java.util.Random;

public class sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjutkanKuis = true;

        while (lanjutkanKuis) {
            int bilanganPertama = random.nextInt(10) + 1;
            int bilanganKedua = random.nextInt(10) + 1;
            int operator = random.nextInt(3);
            int jawabanBenar = 0;
            String operasi = "";
            
            switch (operator) {
                case 0:
                    operasi = "x";
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case 1:
                    operasi = "/";
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case 2:
                    operasi = "%";
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
            }

            System.out.print(bilanganPertama + " " + operasi + " " + bilanganKedua + " = ");
            int jawabanPengguna = scanner.nextInt();

            if (jawabanPengguna == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah " + jawabanBenar);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String respon = scanner.next();

            if (respon.equalsIgnoreCase("tidak")) {
                lanjutkanKuis = false;
            }
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}
