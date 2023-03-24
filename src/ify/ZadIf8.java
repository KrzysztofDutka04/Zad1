package ify;
import java.util.Scanner;
public class ZadIf8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cenaOpr = 99;
        double ilosc = klawisz.nextInt();
        double cena = cenaOpr*ilosc;
        double kwota = 0;
        double rabat = 0;
        if (ilosc>=100) {
            rabat = 50;
        }
        else if (ilosc>=50) {
            rabat = 40;
        }
        else if (ilosc>=20) {
            rabat = 30;
        }
        else if (ilosc>=10) {
            rabat = 20;
        }
        else rabat = 0;
        kwota = cena * (rabat / 100);
        System.out.print("Rabat wynosi " + rabat + "% \nKwota do zaplaty " + kwota + "zl");
    }
}
