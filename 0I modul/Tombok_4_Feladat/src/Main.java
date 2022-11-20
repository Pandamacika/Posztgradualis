import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekeri négy autó adatait
        // (márka, szín, rendszám). Feltételezhetted,
        // hogy a megadott adatok mindig értelmesek,
        // ezt nem kelle ellenőrizni.
        // Tárold az adatokat tömbök tömbjeként, úgy,
        // hogy az első dimenzióban az autókat indexeljük, a másodikban pedig az adataikat.
        System.out.println("Ez a program egy auto adatait keri be");
        Scanner sc = new Scanner(System.in);
        String[][] autok = new String[4][3];
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println("Kerem adja meg a(z) " + (i + 1) + " auto nevet : ");
                    autok[i][j] = sc.nextLine();
                }
                if (j == 1) {
                    System.out.println("Kerem adja meg a(z) " + (i + 1) + " auto szinet : ");
                    autok[i][j] = sc.nextLine();
                }
                if (j == 2) {
                    System.out.println("Kerem adja meg a(z) " + (i + 1) + " auto rendszamat : ");
                    autok[i][j] = sc.nextLine();
                }
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println(autok[i][j]);
                }
                if (j == 1) {
                    System.out.print("  " + autok[i][j] + ",");
                }
                if (j == 2) {

                    System.out.println(autok[i][j]);
                }
            }
        }
    }
}