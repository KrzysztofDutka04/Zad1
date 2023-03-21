package podstawy;

import java.util.Scanner;
public class Zad20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double szCukru = 1.5/48;
        double maslo = 1.0/48;
        double maka = 2.75/48;
        double ilCiastek = klawisz.nextInt();
        double potrzebnyCukier = szCukru * ilCiastek;
        double potrzebneMaslo = maslo * ilCiastek;
        double potrzebnaMaka = maka * ilCiastek;
        System.out.print("Potrzebujesz: \n" +
                potrzebnyCukier + " szklanek cukru \n" +
                potrzebneMaslo + " szklanek masla \n" +
                potrzebnaMaka + " szklanek maki \n");
    }
}
