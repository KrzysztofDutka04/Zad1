package podstawy;

public class Zad6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie2 = 3*4;
        int pomieszczenie3= 2*2;
        int pomieszczenie4 = 2*2;
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
