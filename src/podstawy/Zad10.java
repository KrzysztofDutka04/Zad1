package podstawy;

import java.util.Scanner;
public class Zad10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String firstName = klawisz.nextLine();
        String middleName = klawisz.nextLine();
        String lastName = klawisz.nextLine();
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.print(firstInitial + "" + middleInitial + "" + lastInitial);

    }
}
