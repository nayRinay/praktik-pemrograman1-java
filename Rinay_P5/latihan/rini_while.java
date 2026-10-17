package latihan;

import java.util.Scanner;

public class rini_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menerima input nilai b
        System.out.print("Input nilai b: ");
        int b = input.nextInt();

        // perulangan dengan while
        System.out.println("~~~ PERULANGAN DENGAN WHILE");
        int a = 1;
        while (a<=b) {
            System.out.println("Nilai a: " + a);
            a++;
        }
        input.close();
    }
    
}