package ify;
import java.util.Scanner;
public class ZadIf13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String str = klawisz.nextLine();
        char pakiet = str.charAt(0);
        double min = klawisz.nextInt();
        double cena = 0;
        switch (pakiet) {
            case 'A':
                cena = 39.99;
                if (min>450) cena = cena + ((min-450)*0.45);
                break;
            case 'B':
                cena = 59.99;
                if (min>900) cena = cena + cena + ((min-900)*0.40);
                break;
            case 'C':
                cena = 69.99;
                break;
        }
        System.out.print(cena);
    }
}
