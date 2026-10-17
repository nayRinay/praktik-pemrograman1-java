package latihan;

import java.util.Scanner;

public class rini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // menerima input b
        System.out.print("Masukkan nilai b: ");
        int b=input.nextInt();

        // perulangan dengan for
        System.out.println("~~~ HASIL PERULANGAN ~~~");
        for (int a=1; a<=b; a++){
            System.out.println("Nilai a: " + a);
        }
    }
    
}