package ify;
import java.util.Scanner;
public class ZadIf2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int dd = klawisz.nextInt();
        int mm = klawisz.nextInt();
        int rr = klawisz.nextInt();
        if(dd*mm==rr) System.out.print("Data jest magiczna");
        else System.out.print("Data nie jest magiczna");
    }
}
