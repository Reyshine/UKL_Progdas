import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();
        
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = penjumlahan(bilangan1, bilangan2);
                break;
            case '-':
                hasil = pengurangan(bilangan1, bilangan2);
                break;
            case '*':
                hasil = perkalian(bilangan1, bilangan2);
                break;
            case '/':
                hasil = pembagian(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        
        System.out.printf("Hasil dari %.2f %c %.2f adalah %.2f%n", bilangan1, operator, bilangan2, hasil);
        scanner.close();
    }

    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public static double perkalian(double a, double b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        if (b == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
        return a / b;
    }
}
