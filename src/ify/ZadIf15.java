package ify;
import java.util.Scanner;
public class ZadIf15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double oplata = 10;
        double lCzek = klawisz.nextInt();
        if (lCzek<20) oplata = oplata + (lCzek * 0.1);
        else if (lCzek<40) oplata = oplata + (lCzek * 0.08);
        else if (lCzek<60) oplata = oplata + (lCzek * 0.06);
        else oplata = oplata + (lCzek * 0.04);
        System.out.print(oplata);
    }
}
