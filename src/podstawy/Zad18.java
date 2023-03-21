package podstawy;

import java.util.Scanner;
public class Zad18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double iloscAkcji = 600;
        double cenaAkcji = 21.77;
        double kwota = iloscAkcji * cenaAkcji;
        double prowizja = kwota * 0.02;
        double razem = kwota + prowizja;
        System.out.print("Kwota = " + kwota + "\n" +
                        "Prowizja = " + prowizja + "\n" +
                        "Kwota + prowizja = " + razem);
    }
}
