package ify;
import java.util.Scanner;
public class ZadIf18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Wegetarianie? ");
        String wgt = klawisz.nextLine();
        System.out.print("Weganie? ");
        String wgn = klawisz.nextLine();
        System.out.print("Bez glutenu? ");
        String glu = klawisz.nextLine();
        System.out.println("Mozecie udac sie do: ");
        String nie = "nie";
        if ((nie.equals(wgt))&&(nie.equals(wgn))&&(nie.equals(glu))) System.out.println("Luksusowe burgery u janka");
        if (nie.equals(wgn)) System.out.println("Pizzeria przy dworcowej");
        System.out.println("Kawiarnia na Rogu");
        if ((nie.equals(wgn))&&(nie.equals(glu))) System.out.println("Wloskie specjaly");
        System.out.println("Kuchnia u szefa");

    }
}
