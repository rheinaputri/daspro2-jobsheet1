import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("==============================");


        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");

        } else {
            nilaiAkhir = ((0.2 * tugas) + (0.2 * kuis) + ( 0.3 * uts) + (0.3 * uas));

            if (nilaiAkhir <= 100 && nilaiAkhir> 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir<= 80 && nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir <= 73 && nilaiAkhir> 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir <= 50 && nilaiAkhir> 39) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("==============================");

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }   
}