package podstawy;

import java.util.Scanner;
public class Zad16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String miasto = klawisz.nextLine();
        System.out.print(miasto.length() + "\n" +
                        miasto.toLowerCase() + "\n" +
                        miasto.toUpperCase() + "\n" +
                        miasto.charAt(0));
    }
}
