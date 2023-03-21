package podstawy;

import java.util.Scanner;
public class Zad17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double rachunek = klawisz.nextInt();
        double podatek = rachunek * 0.0675;
        double napiwek = rachunek * 0.20;
        double kwota = rachunek + napiwek;
        System.out.print("Rachunek = " + rachunek + "\n" +
                        "Podatek = " + podatek + "\n" +
                        "Napiwek = " + napiwek + "\n" +
                        "Kwota = " + kwota + "\n");

    }
}
