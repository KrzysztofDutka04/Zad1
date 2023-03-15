import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        double sprzed;
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj sprzedaż firmy: ");
        sprzed = klawisz.nextInt();
        double wojMaz = 0.62;
        double sprzedMaz = wojMaz * sprzed;
        System.out.print("Sprzedaż firmy w woj mazowieckim wynosi: " + sprzedMaz);

    }
}
