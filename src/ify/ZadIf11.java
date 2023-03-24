package ify;
import java.util.Scanner;
public class ZadIf11 {

        String biegacz1 = klawisz.nextLine();
        String biegacz2 = klawisz.nextLine();
        String biegacz3 = klawisz.nextLine();
        double czas1 = klawisz.nextDouble();
        double czas2 = klawisz.nextDouble();
        double czas3 = klawisz.nextDouble();
        if((czas1<=czas2)&&(czas1<=czas3)){
            System.out.println("1. " + biegacz1 + " " + czas1);
            if(czas2<=czas3) {
                System.out.println("2. " + biegacz2 + " " + czas2);
                System.out.println("3. " + biegacz3 + " " + czas3);
            }
            else {
                System.out.println("2. " + biegacz3 + " " + czas3);
                System.out.println("3. " + biegacz2 + " " + czas3);
            }
        }
        else if((czas2<=czas1)&&(czas2<=czas3)){
            System.out.println("1. " + biegacz2 + " " + czas2);
            if (czas1<=czas3) {
                System.out.println("2. " + biegacz1 + " " + czas1);
                System.out.println("3. " + biegacz3 + " " + czas3);
            }
            else {
                System.out.println("2. " + biegacz3 + " " + czas3);
                System.out.println("3. " + biegacz1 + " " + czas1);
            }
        }
        else {
            System.out.println("1. " + biegacz3 + " " + czas3);
            if(czas1<=czas2) {
                System.out.println("2. " + biegacz1 + " " + czas1);
                System.out.println("3. " + biegacz2 + " " + czas2);
            }
            else {
                System.out.println("2. " + biegacz2 + " " + czas2);
                System.out.println("3. " + biegacz1 + " " + czas1);
            }
        }

    }
}
