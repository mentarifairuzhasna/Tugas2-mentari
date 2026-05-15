import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   PROGRAM PENGGAJIAN KARYAWAN");
        System.out.println("========================================");

        // ---- INPUT GOLONGAN ----
        System.out.print("Masukkan Golongan Karyawan (A / B / C): ");
        String golongan = sc.nextLine().trim().toUpperCase();

        // ---- INPUT JAM LEMBUR ----
        System.out.print("Masukkan Jam Lembur (0 jika tidak lembur): ");
        int jamLembur = sc.nextInt();

        // STRUKTUR KEPUTUSAN: Tentukan Gaji Pokok
        double gajiPokok;

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("\n[!] Golongan tidak valid! Masukkan A, B, atau C.");
            sc.close();
            return;
        }

        // STRUKTUR KEPUTUSAN: Tentukan % Lembur
        double persenLembur;

        if (jamLembur == 1) {
            persenLembur = 30;
        } else if (jamLembur == 2) {
            persenLembur = 32;
        } else if (jamLembur == 3) {
            persenLembur = 34;
        } else if (jamLembur == 4) {
            persenLembur = 36;
        } else if (jamLembur >= 5) {
            persenLembur = 38;
        } else {
            persenLembur = 0; // tidak lembur
        }

        // HITUNG GAJI LEMBUR & TOTAL
        double gajiLembur    = gajiPokok * (persenLembur / 100);
        double totalPenghasilan = gajiPokok + gajiLembur;

        // OUTPUT / CETAK HASIL
        System.out.println("\n========================================");
        System.out.println("         RINCIAN PENGHASILAN");
        System.out.println("========================================");
        System.out.printf("  Golongan Karyawan  : %s%n", golongan);
        System.out.printf("  Gaji Pokok         : Rp %,.0f%n", gajiPokok);

        if (jamLembur > 0) {
            System.out.printf("  Jam Lembur         : %d Jam%n", jamLembur);
            System.out.printf("  Persentase Lembur  : %.0f%%%n", persenLembur);
            System.out.printf("  Gaji Lembur        : Rp %,.0f%n", gajiLembur);
        } else {
            System.out.println("  Jam Lembur         : Tidak Lembur");
        }

        System.out.println("----------------------------------------");
        System.out.printf("  JUMLAH PENGHASILAN : Rp %,.0f%n", totalPenghasilan);
        System.out.println("========================================");

        sc.close();
    }
}