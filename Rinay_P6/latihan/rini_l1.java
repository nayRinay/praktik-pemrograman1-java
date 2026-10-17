package latihan;

import java.util.Scanner;

public class rini_l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();

        if (nilai >=60 && nilai <= 100) {
            System.out.println("Mahasiswa LULUS");
        } else if (nilai >=0 && nilai < 60) {
            System.out.println("Mahasiswa TIDAK LULUS");
        } else {
            System.out.println("Nilai tidak valid");
        }
        input.close();
    }
    
}