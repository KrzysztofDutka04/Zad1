package ify;
import java.util.Scanner;
public class ZadIf5 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double masa = klawisz.nextInt();
        double ciezar = masa * 9.8;
        if(ciezar>1000) System.out.print("Obiekt jest za ciezki");
        else if(ciezar>10) System.out.print(ciezar);
        else System.out.print("Obiekt jest za lekki");
    }
}
