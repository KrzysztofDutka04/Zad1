package ify;
import java.util.Scanner;
public class ZadIf6 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int sek = klawisz.nextInt();
        int d = 0;
        int h = 0;
        int min = 0;
        if (sek>=86400) {
            d = sek/86400;
            sek = sek - (d*86400);
        }
        if (sek>=3600) {
            h = sek/3600;
            sek = sek - (h*3600);
        }
        if (sek>=60) {
            min = sek/60;
            sek = sek - (min*60);
        }
        System.out.print(d + " dni, " + h + " godzin, " + min + " minut, " + sek + " sekund");
    }
}
