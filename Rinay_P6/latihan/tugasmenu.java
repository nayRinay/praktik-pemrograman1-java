package latihan;

import java.util.Scanner;
public class tugasmenu {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan;

    // perulangan do while agar menu terus tampil sampai user memilih angka 3 (keluar)
    do {
        System.out.println("\n~~~ MENU PROGRAM ~~~");
        System.out.println("1. Cek Ganjil/Genap");
        System.out.println("2. Tampilkan Angka 1 sampai n");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu: ");

        pilihan = input.nextInt();

        // percabangan  switch-case untuk memproses pilihan menu
        switch(pilihan){
            case 1:
                System.out.print("Masukkan bilangan: ");
                int angka = input.nextInt();

                // percabangan if else untuk menentukan ganjil genap
                if(angka %2 == 0){
                    System.out.println("Bilangan Genap");
                } else {
                    System.out.println("Bilangan Ganjil");
                }
                break;

            case 2:
                System.out.print("Masukkan N: ");
                int n = input.nextInt();

                // perulangan for untuk menampilkan angka 1 sampai n
                for(int i=1; i<=n; i++){
                    System.out.print(i + " ");
                }
                System.out.println(); // pinddah baris baru setelah perulangan selesai
                break;

            case 3:
                System.out.println("Program selesai.");
                break;

            default:
                // menampilkan pesan jika pilihan tidak aa di menu
                System.out.println("Pilihan tidak valid.");
            }
        } while(pilihan !=3);

        input.close();
    }
}
    