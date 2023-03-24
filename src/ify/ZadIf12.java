package ify;
import java.util.Scanner;
public class ZadIf12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String slowo = klawisz.nextLine();
        double odleglosc = klawisz.nextInt();
        double szybkosc = 0;
        switch (slowo) {
            case "powietrze":
                szybkosc = 343;
                break;
            case "woda":
                szybkosc = 1490;
                break;
            case "stal":
                szybkosc = 5100;
                break;
        }
        double czas = odleglosc / szybkosc;
        System.out.print(czas);
    }
}
