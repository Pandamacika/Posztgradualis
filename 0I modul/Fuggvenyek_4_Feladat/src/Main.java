

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int db = 100;
    public static int darabszam;

    public static void main(String[] args) {
        //Írj egy programot ami *-ig kér be neveket. Utána újra *-ig kér be karaktereket.
        // Minden karakter bekérése után kiírja azokat a neveket, amelyek tartalmazzák
        // a megadott karaktert. Ez után felajánlja az új karakter megadási lehetőségét.
        out.println(" Ez a program kiirja azokat a neveket, emelyekben van egy adott karakter !");
        Scanner sc = new Scanner(in);
        String kilepes = "*";
        System.out.println(" Kerem adja meg a neveket : ");
        String[] uj_szoveg = getStrings(sc, kilepes);
        System.out.println(" A beolvasott nevek : ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(uj_szoveg[i] + ",");
        }
    }

    private static String[] getStrings(Scanner sc, String kilepes) {
        String[] szoveg = new String[db];
        String[] betuk = new String[db];

        for (int i = 0; i < db; i++) {
            String[] nevek = new String[db];
            nevek[i] = sc.nextLine();
            szoveg[i] = nevek[i];
            darabszam++;
            if (nevek[i].equals(kilepes)) {
                System.out.println(" Vege");
                System.out.println(" Kerem adja meg a keresett betut : ");
                for (int j = 0; j < db; j++) {
                    String[] betu = new String[db];
                    betu[j] = sc.nextLine();
                    betuk[j] = betu[j];
                    if (betu[j].equals(kilepes)) {
                        System.out.println(" Vege ");
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(" A kovetkezo szavakban talalhato meg a betu : ");
        for (int i = 0; i < darabszam; i++) {
            if (szoveg[i].contains(betuk[0])) {
                System.out.println(szoveg[i]);
            }
        }
        return szoveg;
    }
}


