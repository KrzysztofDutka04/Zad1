package podstawy;

import java.util.Scanner;
public class Zad19 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double ankietowani = 12467;
        double en = ankietowani * 0.14;
        double enCy = en * 0.64;
        System.out.print("Kupujacy energetyki = " + en + "\n" +
                        "Kupujacy energetyki cytrusowe = " + enCy);
    }
}
