package ify;
import java.util.Scanner;
public class ZadIf7 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String imie1 = klawisz.nextLine();
        String imie2 = klawisz.nextLine();
        String imie3 = klawisz.nextLine();
        int i1 = imie1.compareTo(imie2);
        int i2 = imie1.compareTo(imie3);
        int i3 = imie2.compareTo(imie3);
        if ((i1<0)&&(i2<0)){
            System.out.println(imie1);
            if (i2<0) {
                System.out.println(imie2);
                System.out.println(imie3);
            }
            else {
                System.out.println(imie3);
                System.out.println(imie2);
            }
        }
        else if ((i1>0)&&(i3<0)) {
            System.out.println(imie2);
            if (i2<0) {
                System.out.println(imie1);
                System.out.println(imie3);
            }
            else {
                System.out.println(imie3);
                System.out.println(imie1);
            }
        }
        else {
            System.out.println(imie3);
            if (i1<0) {
                System.out.println(imie1);
                System.out.println(imie2);
            }
            else {
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }
    }
}
