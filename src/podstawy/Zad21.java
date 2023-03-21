package podstawy;

import java.util.Scanner;
import static java.lang.Math.pow;
public class Zad21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj kwote poczatkowa: ");
        double p = klawisz.nextInt();
        System.out.println("Podaj roczna stope oprocentowania: ");
        double r = klawisz.nextInt();
        System.out.println("Podaj liczbe kapitalizacji odsetek w ciagu roku: ");
        double n = klawisz.nextInt();
        System.out.println("Podaj ilosc lat generowania odsetek: ");
        double t = klawisz.nextInt();
        double a = pow( p * (1 + (r / n)), n*t);
        System.out.print("Kwota: " + a);
    }
}
