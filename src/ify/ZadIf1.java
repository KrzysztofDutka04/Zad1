package ify;
import java.util.Scanner;
public class ZadIf1 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l = klawisz.nextInt();
        String rz = "0";
        switch (l) {
            case 1:
                rz = "I";
                break;
            case 2:
                rz = "II";
                break;
            case 3:
                rz = "III";
                break;
            case 4:
                rz = "IV";
                break;
            case 5:
                rz = "V";
               break;
            case 6:
                rz = "VI";
                break;
            case 7:
                rz = "VII";
                break;
            case 8:
                rz = "VIII";
                break;
            case 9:
                rz = "IX";
                break;
            case 10:
                rz = "X";
                break;
        }
        System.out.print(rz);
    }
}
