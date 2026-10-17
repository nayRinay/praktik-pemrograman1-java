package latihan;
import java.util.Scanner;

class rini {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // s1 input realisasi, kehadiran, tugas, uts, uas
    System.out.println("~~~ Input Nilai ~~~");
    System.out.print("Masukkan Realisasi: ");
    float realisasi = input.nextFloat();
    System.out.print("Masukkan kehadiran: ");
    float kehadiran = input.nextFloat();
    System.out.print("Masukkan Tugas: ");
    float tugas = input.nextFloat();
    System.out.print("Masukkan UTS: ");
    float uts = input.nextFloat();
    System.out.print("Masukkan UAS: ");
    float uas = input.nextFloat();

    //p1 menghitung nilai akhir (n)
    double n = ((double)kehadiran/realisasi*10)+(tugas*0.20)+(uts*0.30)+(uas*0.40);
    
    String g="";
    String k="";

    // pengecekan kondisi
    if (n>=80) {
        // proses2
        g="A";
        k="Lulus";
    } else if (n>=70) {
        // proses 3
        g="B";
        k="Lulus";
    } else{
        // proses 4
        g="E";
        k="Tidak Lulus";
    }

    // statement 2
    System.out.println("~~~ Hasil Nilai ~~~");
    System.out.println("Nilai Akhir: "+n);
    System.out.println("Grade: "+g);
    System.out.println("Keterangan: "+k);

    input.close();
}
}