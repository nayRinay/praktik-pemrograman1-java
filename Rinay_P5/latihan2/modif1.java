package latihan2;

import java.util.Scanner;

public class modif1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double realisasi = 0;
        double kehadiran = 0;
        double tugas = 0;
        double uts = 0;
        double uas = 0;

        double bobotkehadiran = 0;
        double bobottugas = 0;
        double bobotuts = 0;
        double bobotuas = 0;
        double total = 0;

        // Loop utama untuk memastikan total nilai >= 60 (Kriteria Lulus)
        do {
            System.out.println("\n~~~ INPUT NILAI ~~~");
            System.out.print("Masukkan Realisasi: ");
            realisasi = input.nextDouble();

            // VALIDASI: Loop khusus agar kehadiran TIDAK BOLEH melebihi realisasi
            do {
                System.out.print("Masukkan Kehadiran (maksimal " + realisasi + "): ");
                kehadiran = input.nextDouble();
            } while (kehadiran > realisasi); // Akan ngulang terus kalau input kehadiran > realisasi

            System.out.print("Masukkan Tugas: ");
            tugas = input.nextDouble();

            System.out.print("Masukkan UTS: ");
            uts = input.nextDouble();

            System.out.print("Masukkan UAS: ");
            uas = input.nextDouble();

            // P1: Menghitung bobot nilai
            bobotkehadiran = ((double) kehadiran / realisasi * 10);
            bobottugas = tugas * 0.20;
            bobotuts = uts * 0.30;
            bobotuas = uas * 0.40;

            // Menghitung total nilai
            total = bobotkehadiran + bobottugas + bobotuts + bobotuas;

        } while (total < 60); // Otomatis ulang ke S1 & P1 jika total < 60

        // P2: Set keterangan (tanpa if-else)
        String k = "Lulus";

        // S2: Cetak hasil akhir di luar do-while
        System.out.println("\n~~~ RINCIAN BOBOT TERAKHIR ~~~");
        System.out.println("Bobot Kehadiran : " + bobotkehadiran);
        System.out.println("Bobot Tugas     : " + bobottugas);
        System.out.println("Bobot UTS       : " + bobotuts);
        System.out.println("Bobot UAS       : " + bobotuas);
        System.out.println("Total Nilai     : " + total);

        System.out.println("\n~~~ HASIL NILAI ~~~");
        System.out.println("Total Nilai : " + total);
        System.out.println("Keterangan  : " + k);

        System.out.println("\nProgram selesai!");
        input.close();
    }
}