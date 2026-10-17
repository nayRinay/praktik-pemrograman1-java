package latihan;

import java.util.Scanner;

public class rini_l2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = input.nextInt();

        System.out.println("Bilangan genap: ");

        int i = 2; // inisialisasi variabel di awal
        do{
            System.out.print(i+ " "); //eksekusi kode dilakukan minimal 1x
            i += 2; //incrementation
        } while (i <= n); //pengecekean kondisi dilakukan di akhir

        input.close();
    }
    
}