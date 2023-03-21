package podstawy;

import java.util.Scanner;
public class Zad14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double w1 = klawisz.nextInt();
        double w2 = klawisz.nextInt();
        double w3 = klawisz.nextInt();
        double sr = (w1+w2+w3)/3;
        System.out.print("Wynik 1 = " + w1 + "\n" +
                "Wynik 2 = " + w2 + "\n" +
                "Wynik 3 = " + w3 + "\n" +
                "Srednia = " + sr);
    }
}
