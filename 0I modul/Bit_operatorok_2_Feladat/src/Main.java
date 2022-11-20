import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot, ami beolvas egy egész számot, binárisan összevagyolja 512-vel,
        // majd az eredményt kíjra.
        //Ennek a programnak a segítségével adj meg 1-1 olyan különböző számot ami:
        // a. Kisebb mint 512 és a program kimenete 548.
        //b. Nagyobb mint 512 és a program kimenete 1536.
        // (próbáljuk okosan kitalálni, hogy mivel érdemes próbálkozni)
        System.out.println(" Ez a program binarisan osszevagyol ket szamot ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adjon meg egy egesz szamot : ");
        int a = 512;
        int b = sc.nextInt();
        int avagyb = a | b;
        System.out.println(" az eredmeny : " + avagyb);
        int c = 36;
        int avagyc = a | c;
        System.out.println(" pelda,amikor az eredmeny 548 : " + avagyc);
        int d = 1024;
        int avagyd = a | d;
        System.out.println(" pelda,amikor az eredmeny 1536 : " + avagyd);
    }
}