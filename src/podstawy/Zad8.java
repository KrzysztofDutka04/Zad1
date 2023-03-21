package podstawy;

import java.util.Scanner;
public class Zad8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj dlugosc pomieszczenia 1:");
        int dl1 = klawisz.nextInt();
        System.out.print("Podaj szerokosc pomieszczenia 1:");
        int sz1 = klawisz.nextInt();
        System.out.print("Podaj dlugosc pomieszczenia 2:");
        int dl2 = klawisz.nextInt();
        System.out.print("Podaj szerokosc pomieszczenia 2:");
        int sz2= klawisz.nextInt();
        System.out.print("Podaj dlugosc pomieszczenia 3:");
        int dl3 = klawisz.nextInt();
        System.out.print("Podaj szerokosc pomieszczenia 3:");
        int sz3 = klawisz.nextInt();
        System.out.print("Podaj dlugosc pomieszczenia 4 :");
        int dl4 = klawisz.nextInt();
        System.out.print("Podaj szerokosc pomieszczenia 4 :");
        int sz4 = klawisz.nextInt();
        int pomieszczenie1 = dl1*sz1;
        int pomieszczenie2 = dl2*sz2;
        int pomieszczenie3= dl3*sz3;
        int pomieszczenie4 = dl4*sz4;
        int razem = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        int lOs = 4;
        int powNaOs1 = pomieszczenie1 / lOs;
        int powNaOs2 = pomieszczenie2 / lOs;
        int powNaOs3= pomieszczenie3 / lOs;
        int powNaOs4 = pomieszczenie4 / lOs;
        int powNaOs5 = razem / lOs;
        System.out.println("Powieszchnia na os: " +
                "\n Pomieszczenie 1 = " + powNaOs1 +
                "\n Pomieszczenie 2 = " + powNaOs2 +
                "\n Pomieszczenie 3 = " + powNaOs3 +
                "\n Pomieszczenie 4 = " + powNaOs4 +
                "\n Pomieszczenia razem= " +  powNaOs5);
    }
}
