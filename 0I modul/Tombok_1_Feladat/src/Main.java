import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot, ami beolvas 3 keresztnevet
        // (feltételezhető, hogy amit beír a felhasználó,
        // az keresztnév), majd ezeket fordított sorrendben kiírja.

        System.out.println("Ez a program 3 keresztnevet olvas be . ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg az elso nevet : ");
        String nev1 = sc.nextLine();
        System.out.println("Kerem adja meg a masodik nevet : ");
        String nev2 = sc.nextLine();
        System.out.println("Kerem adja meg a harmadik nevet : ");
        String nev3 = sc.nextLine();
        if ((nev1.compareTo(nev2) < 0) && (nev1.compareTo(nev3) < 0) && nev2.compareTo(nev3) < 0) {
            System.out.println(nev3 + "," + nev2 + "," + nev1);
        } else if ((nev1.compareTo(nev2) < 0) && (nev1.compareTo(nev3) < 0) && nev3.compareTo(nev2) < 0) {
            System.out.println(nev2 + "," + nev3 + "," + nev1);
        } else if ((nev2.compareTo(nev1)) < 0 && (nev2.compareTo(nev3)) < 0 && (nev1.compareTo(nev3)) < 0) {
            System.out.println(nev3 + "," + nev1 + "," + nev2);
        } else if ((nev2.compareTo(nev1)) < 0 && (nev2.compareTo(nev3)) < 0 && (nev3.compareTo(nev1)) < 0) {
            System.out.println(nev1 + "," + nev3 + "," + nev2);
        } else if ((nev3.compareTo(nev1)) < 0 && (nev3.compareTo(nev2)) < 0 && (nev1.compareTo(nev2)) < 0) {
            System.out.println(nev2 + "," + nev1 + "," + nev3);
        } else if ((nev3.compareTo(nev1)) < 0 && (nev3.compareTo(nev2)) < 0 && (nev2.compareTo(nev3)) < 0)
            System.out.println(nev1 + "," + nev2 + "," + nev3);
    }

}
