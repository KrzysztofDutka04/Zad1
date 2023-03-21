package podstawy;

import java.util.Scanner;
public class Zad23 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Dlugosc rzedu = ");
        double r = klawisz.nextInt();
        System.out.print("Okratowanie = ");
        double e = klawisz.nextInt();
        System.out.print("Odleglosc miedzy sadzonkami = ");
        double s = klawisz.nextInt();
        double v = (r - (2 * e)) / s;
        System.out.print("Ilosc sadzonek w rzedzie = " + v);
    }
}
