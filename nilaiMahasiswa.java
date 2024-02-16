import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        System.out.println("==============================");

        if (!isValidInput(tugas) || !isValidInput(kuis) || !isValidInput(uts) || !isValidInput(uas)) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        String nilaiHuruf = hitungNilaiHuruf(nilaiAkhir);

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");

        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }

    public static boolean isValidInput(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
    }

    public static String hitungNilaiHuruf(double nilai) {
        if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
