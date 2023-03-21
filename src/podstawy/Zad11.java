package podstawy;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double wartosc = klawisz.nextInt();
        double pStan = wartosc * 0.04;
        double pLoka = wartosc * 0.02;
        double sprzedaz = wartosc + pStan + pLoka;
        System.out.print(sprzedaz);
    }
}
