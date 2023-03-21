package podstawy;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String name = klawisz.nextLine();
        int age = klawisz.nextInt();
        double annualPay = klawisz.nextInt();
        System.out.print("Nazywam sie "+ name +
                " mam "+ age +
                " lat i chce zarabiac "+ annualPay +
                " zlotych rocznie");

    }
}
