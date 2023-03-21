package ify;
import java.util.Scanner;
public class ZadIf3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double waga = klawisz.nextInt();
        double wzrost = klawisz.nextInt();
        double bmi = waga / (wzrost / 50);
        if(bmi>25) System.out.print("Nadwaga");
        else if(bmi>=18.5) System.out.print("Optymalna waga");
        else System.out.print("Niedowaga");
    }
}
