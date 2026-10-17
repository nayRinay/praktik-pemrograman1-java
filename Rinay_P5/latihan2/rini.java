package latihan2;

import java.util.Scanner;

public class rini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasikan variabel 
        double realisasi=0;
        double kehadiran=0;
        double tugas=0;
        double uts=0;
        double uas=0;

        double bobotkehadiran=0;
        double bobottugas=0;
        double bobotuts=0;
        double bobotuas=0;
        double total=0;

        do {
            // s1 untuk menginput
            System.out.println("\n~~~ INPUT NILAI ~~~");
            System.out.print("Masukkan Realisasi: ");
            realisasi = input.nextDouble();

            System.out.print("Masukkan Kehadiran: ");
            kehadiran = input.nextDouble();

            System.out.print("Masukkan Tugas: ");
            tugas = input.nextDouble();

            System.out.print("Masukkan UTS: ");
            uts = input.nextDouble();

            System.out.print("Masukkan UAS: ");
            uas = input.nextDouble();

            // p1 menghitung bobot/nilai akhir
            bobotkehadiran = ((double) kehadiran/realisasi*10);
            bobottugas = tugas* 0.20;
            bobotuts = uts* 0.30;
            bobotuas = uas*0.40;

            // menghitung total
            total = bobotkehadiran + bobottugas + bobotuts + bobotuas;

        } while (total<60);

            // p2 keterangan lulus
            String k = "Lulus";

            // s2 cetak total dan keterangan
            System.out.println("\n~~~ RINCIAN BOBOT TERAKHIR ~~~");
            System.out.println("Bobot kehadiran: " + bobotkehadiran);
            System.out.println("Bobot Tugas: " + bobottugas);
            System.out.println("Bobot UTS: " + bobotuts);
            System.out.println("Bobot UAS: " + bobotuas);

            System.out.println("\n~~~ HASIL NILAI ~~~");
            System.out.println("Total nilai: " + total);
            System.out.println("Keterangan: " + k);

        System.out.println("\nProgram selesai!");
        input.close();
    }
    
}