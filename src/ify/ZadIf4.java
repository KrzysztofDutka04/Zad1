package ify;
import java.util.Scanner;
public class ZadIf4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double ocena1 = klawisz.nextInt();
        double ocena2 = klawisz.nextInt();
        double ocena3 = klawisz.nextInt();
        double srednia = (ocena1 + ocena2 + ocena3)/3;
        int ocena = 0;
        if(srednia>=90) ocena = 5;
        else if(srednia>=80) ocena = 4;
        else if(srednia>=70) ocena = 3;
        else if(srednia>=60) ocena = 2;
        else ocena = 1;
        System.out.print("Ocena = " + ocena);
    }
}
