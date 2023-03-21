package podstawy;

import java.util.Scanner;
public class Zad22 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double liczbaAkcji = 1000;
        double cenaAkcji = 32.87 * liczbaAkcji;
        double prowizja = cenaAkcji * 0.02;
        double cenaZakupu = cenaAkcji + prowizja;
        double nowaCenaAkcji = 33.92 * liczbaAkcji;
        double nowaProwizja = nowaCenaAkcji * 0.02;
        double cenaSprzedazy = nowaCenaAkcji - nowaProwizja;
        double zysk = cenaSprzedazy - cenaZakupu;
        System.out.print("Zaplacona kwota = " + cenaZakupu + "\n" +
                "Prowizja przy zakupie = " + prowizja + "\n" +
                "Otrzymana kwota = " + cenaSprzedazy + "\n" +
                "Prowizja przy sprzedazy = " + nowaProwizja + "\n" +
                "Zysk = " + zysk);


    }
}
