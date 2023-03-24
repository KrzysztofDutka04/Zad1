package ify;
import java.util.Scanner;
public class ZadIf16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int lKsiazek = klawisz.nextInt();
        int pkt = 0;
        switch (lKsiazek) {
            case 0:
                pkt = 0;
                break;
            case 1:
                pkt = 5;
                break;
            case 2:
                pkt = 15;
                break;
            case 3:
                pkt = 30;
                break;
            default:
                pkt = 60;
        }
        System.out.print(pkt);
    }
}
