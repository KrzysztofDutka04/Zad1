package ify;
import java.util.Scanner;
public class ZadIf10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cal = klawisz.nextInt();
        double fat = klawisz.nextInt();
        double calFat = fat * 9;
        double pr = calFat / cal;
        if (pr<=0.3) System.out.println("Produkt jet niskotluszczowy");
        if (pr>1.0) System.out.println("Zle dane");
        else {
            System.out.println(pr*100);
        }
    }
}
