package podstawy;

import java.util.Scanner;
public class Zad15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double marza = 0.4;
        double cenaDetaliczna = klawisz.nextInt();
        double zysk = marza * cenaDetaliczna;
        System.out.print("Zysk = "+ zysk);
    }
}
