import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array untuk menyimpan nama mata kuliah
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        // Array untuk menyimpan nilai angka mata kuliah
        double[] nilaiAngka = new double[mataKuliah.length];
        // Array untuk menyimpan bobot SKS mata kuliah
        double[] bobotSKS = { 3, 3, 2, 3, 2, 3, 2, 2 };

        // Memasukkan nilai angka untuk setiap mata kuliah
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==========================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            if (!isValidNilai(nilaiAngka[i])) {
                System.out.println("nilai tidak valid");
                return;
            }
        }
        System.out.println("===================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("MK\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("===================");
        double totalSKS = 0;
        double totalBobotNilai = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilai(nilaiAngka[i]);
            double bobotNilai = hitungBobot(nilaiAngka[i]);
            totalSKS += bobotSKS[i];
            totalBobotNilai += bobotNilai;

            System.out.printf("%-40s%.2f\t\t%s\t\t%.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai);
        }

        double ipSemester = totalBobotNilai / totalSKS;
        System.out.println("IP : " + ipSemester);
    }

    // Method untuk memeriksa validitas nilai
    public static boolean isValidNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // Method untuk mengonversi nilai angka menjadi huruf
    public static String konversiNilai(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 50) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    // Method untuk menghitung bobot nilai
    public static double hitungBobot(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.00;
        } else if (nilaiAngka > 73) {
            return 3.50;
        } else if (nilaiAngka > 65) {
            return 3.00;
        } else if (nilaiAngka > 60) {
            return 2.50;
        } else if (nilaiAngka > 50) {
            return 2.00;
        } else if (nilaiAngka > 39) {
            return 1.00;
        } else {
            return 0.00;
        }
    }
}
