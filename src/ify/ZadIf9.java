package ify;
import java.util.Scanner;
public class ZadIf9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double kg = klawisz.nextDouble();
        double km = klawisz.nextInt();
        double cena = 0;
        if (kg<=1.0) cena = 1.1;
        else if (kg<=3) cena = 2.2;
        else if (kg<=5) cena = 3.7;
        else cena = 3.8;
        int zaplataKm = (int) (km/500);
        if(km%500!=0) zaplataKm = zaplataKm +1;
        double kwota = cena * zaplataKm;
        System.out.print(kwota);
    }
}
