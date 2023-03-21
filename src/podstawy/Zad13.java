package podstawy;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double lCsc = 40;
        double porcja = lCsc/10;
        double kalorie = 300/porcja;
        double ilZdnCsc = klawisz.nextInt();
        double ZdnKlr = kalorie * ilZdnCsc;
        System.out.print(ZdnKlr);
    }
}
