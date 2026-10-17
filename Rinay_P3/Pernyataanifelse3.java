import java.io.*;  //ini otomatis mengimport BufferredReader,InputStreamReader, dan IOException

public class Pernyataanifelse3 {
    public static void main(String[] args) {
        BufferedReader dataIn= new BufferedReader(new InputStreamReader(System.in));

        String nama = "";
        String nim = "";
        String gradeString = "";
        Byte grade =0;

        try {
            System.out.print("Masukkan Nama: ");
            nama = dataIn.readLine();

            System.out.print("Masukkan NIM: ");
            nim = dataIn.readLine();

            System.out.print("Masukkan Nilai: ");
            gradeString = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan!");
        }
        grade = Byte.parseByte(gradeString); //mengubah teks string menjadi nilai angka tanpa membuat objek baru

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Atas nama   : " + nama);
        System.out.println("Dengan NIM  : " + nim);

        if (grade >=80) {
            System.out.println("Selamat Anda Lulus!");
            System.out.println("Karena Nilai Anda " + grade + "!");
        } else{
            System.out.println("Maaf Abda Belum Lulus!");
            System.out.println("Karena Nilai Anda " + grade + "!");
        }
    }
    
}