package ify;
import java.util.Scanner;
public class ZadIf14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String str = klawisz.nextLine();
        char pakiet = str.charAt(0);
        double min = klawisz.nextInt();
        double cena = 0;
        double cenaA = 0;
        double cenaB = 0;
        double cenaC = 0;
        char kontrola = pakiet;
        int i = 0;
        int j = 0;
        do {
            switch (pakiet) {
                case 'A':
                    cenaA = 39.99;
                    if (min > 450) cenaA = cenaA + ((min - 450) * 0.45);
                    break;
                case 'B':
                    cenaB = 59.99;
                    if (min > 900) cenaB = cenaB + ((min - 900) * 0.40);
                    break;
                case 'C':
                    cenaC = 69.99;
                    break;
            }
            if (kontrola == 'A') {
                if (pakiet == 'A') System.out.println("Cena " + cenaA);
                if (pakiet=='B') {
                    cena = cenaA - cenaB;
                    System.out.println("Przy pakiecie B zaoszczedzasz " + cena);
                    j = 1;
                }
                if (pakiet=='C') {
                    cena = cenaA - cenaC;
                    System.out.println("Przy pakiecie C zaoszczedzasz " + cena);
                    i=1;
                }
                if (pakiet=='A') pakiet = 'B';
                if ((pakiet=='B')&&(j==1)) pakiet = 'C';
            }
            if (kontrola == 'B') {
                if (pakiet == 'B') System.out.println("Cena " + cenaB);
                if (pakiet=='C') {
                    cena = cenaB - cenaC;
                    System.out.println("Przy pakiecie C zaoszczedzasz " + cena);
                    j=1;
                }
                if (pakiet=='A') {
                    cena = cenaB - cenaA;
                    System.out.println("Przy pakiecie A zaoszczedzasz " + cena);
                    i=1;
                }
                if (pakiet=='B') pakiet = 'C';
                if ((pakiet=='C')&&(j==1)) pakiet = 'A';
            }
            if (kontrola == 'C') {
                if (pakiet == 'C') System.out.println("Cena " + cenaC);
                if (pakiet=='A') {
                    cena = cenaC - cenaA;
                    System.out.println("Przy pakiecie A zaoszczedzasz " + cena);
                    j = 1;
                }
                if (pakiet=='B') {
                    cena = cenaC - cenaB;
                    System.out.println("Przy pakiecie B zaoszczedzasz " + cena);
                    i=1;
                }
                if (pakiet=='C') pakiet = 'A';
                if ((pakiet=='A')&&(j==1)) pakiet = 'B';
            }
        } while (i!=1);

    }
}
