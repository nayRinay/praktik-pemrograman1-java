package latihan2;

import java.util.Scanner;

public class modif2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi data mahasiswa
        String nim;
        String nama;

        //Deklarasi nilai
        double realisasi;
        double kehadiran;
        double tugas;
        double uts;
        double uas;

        double bobotkehadiran;
        double bobottugas;
        double bobotuts;
        double bobotuas;
        double total;

        //input data mahasiswa
        System.out.println(" ~~~ INPUT DATA MAHASISWA ~~~");
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        //perulangan untuk memastikan total >=60 agar lulus
        do{
            System.out.println("\n~~~ INPUT NILAI ~~~");
            System.out.print("Input Realisasi: ");
            realisasi = Double.parseDouble(input.nextLine());

            //validasi perulangan agar kehadiran ga lebih dari realisasi
            do {
                System.out.print("Input Kehadiran(maks " + realisasi + "): ");
                kehadiran = Double.parseDouble(input.nextLine());
            } while (kehadiran > realisasi); //akan meminta input ulang terus sampai kehaduran <=realisasi

            System.out.print("Input Tugas: ");
            tugas = Double.parseDouble(input.nextLine());

            System.out.print("Input UTS: ");
            uts = Double.parseDouble(input.nextLine());

            System.out.print("Input UAS: ");
            uas = Double.parseDouble(input.nextLine());

            //P1: menghitung bobot nilai
            bobotkehadiran = ((double) kehadiran/realisasi*10);
            bobottugas = tugas*0.20;
            bobotuts = uts*0.30;
            bobotuas = uas*0.40;

            //menghitung total nilai
            total = bobotkehadiran + bobottugas + bobotuts + bobotuas;

            //memberi pesan kalo tital<60 agar pengguna input ulang
            if (total<60) {
                System.out.println("\n Total Nilai (" + total + ") <60. Anda TIdak Lulus. Silahkan input ulang nilai!");
            }

        } while (total<60); //otomatis akan mengulang untuk minta input nilai ulang

        //p2 modifikasi penentua grade nilai
        String grade;
        if (total>=80){
            grade="A";
        } else if (total>=70){
            grade="B";
        }else if (total>=60){
            grade="C";
        } else if (total>=50){
            grade="D";
        } else{
            grade="E";
        }
        
        //Keterangan = lulus
        String k = "Lulus";

        //S2: Cetak hasil akhir
        System.out.println("\n==== HASIL AKHIR NILAI MAHASISWA UNPAM =====");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Bobot Kehadiran : " + String.format("%.2f", bobotkehadiran));
        System.out.println("Bobot Tugas     : " + String.format("%.2f", bobottugas));
        System.out.println("Bobot UTS       : " + String.format("%.2f", bobotuts));
        System.out.println("Bobot UAS       : " + String.format("%.2f", bobotuas));
        System.out.println("Total Nilai     : " + String.format("%.2f", total));
        System.out.println("Grade Nilai     : " + grade);
        System.out.println("Keterangan      : " + k);

        System.out.println("\nProgram selesai!");
        input.close();
    }
}
