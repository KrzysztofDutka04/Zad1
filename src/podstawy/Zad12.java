package podstawy;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double km = klawisz.nextInt();
        double lplw = klawisz.nextInt();
        double kmnlplw = km / lplw;
        System.out.print(kmnlplw);
    }
}
