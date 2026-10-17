import java.util.Scanner;

public class rinikurniawati_l1 {
    public static void main(String args[]){
        float s,t,V=0;
        Scanner input= new Scanner(System.in);

        //S1
        System.out.print("input s: ");
        s=input.nextFloat();
        System.out.print("input t: ");
        t=input.nextFloat();

        //p1
        V=s/t;
        
        //S2
        System.out.println("Jarak : "+s+"m");
        System.out.println("waktu :  "+t+"s");
        System.out.println("Kecepatan : "+V+"m/s^2");
    }
}