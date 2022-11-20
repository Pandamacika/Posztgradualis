import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        //. Írj egy programot, amely egy karakterláncot kér be.
        // Majd minden olyan betüről, ami legalább kétszer szerepel,
        // kiírja, hogy az hányszor szerepelt. Pl: „thequickbrownfoxjumpsoverthelazydog”
        // esetén o 4, e 3, u 2, h 2, r 2, t 2. Bónuszpontért lehet előfordulási gyakoriság
        // szerint csökkenő sorrendben kiírni.
        System.out.println(" Ez a program egy karakterlanc betuit elemzi ! ");
        Scanner sc = new Scanner(System.in);
        String karakterlanc = sc.nextLine();
        int hossz = karakterlanc.length();
        System.out.println(" A karakterlanc hossza : " + hossz);
        char[] betuk = new char[hossz];
        String uj_karakterlanc = karakterlanc.replace(" ", "");
        uj_karakterlanc = uj_karakterlanc.replace(".", "");
        uj_karakterlanc = uj_karakterlanc.replace(",", "");
        uj_karakterlanc = uj_karakterlanc.replace(":", "");
        uj_karakterlanc = uj_karakterlanc.replace("?", "");
        uj_karakterlanc = uj_karakterlanc.toLowerCase();
        int hossz2 = uj_karakterlanc.length();
        System.out.println(" Az uj karakterlanc hossza,ami csak kis  betuket tartalmaz : " + hossz2);
        int[] darabszam = new int[hossz2];
        for (int i = 0; i < hossz2; i++) {
            betuk[i] = uj_karakterlanc.charAt(i);
            System.out.print(betuk[i] + ",");
        }
        System.out.println();
        for (int j = 0; j < hossz2; j++) {

            for (int k = 0; k < hossz2; k++) {
                if (Objects.equals(betuk[j], betuk[k])) {
                    darabszam[j]++;
                }
            }
        }
        String[] s = new String[hossz2];
        for (int m = 0; m < hossz2; m++) {
            s[m] = Character.toString(betuk[m]);
            System.out.print(s[m] + ",");
        }
        System.out.println();

        String[] csere_osszevonva = new String[hossz2];
        for (int n = 0; n < hossz2; n++) {
            csere_osszevonva[n] = darabszam[n] + " : " + betuk[n];

            System.out.println(" A karakterek szama es a betui : " + csere_osszevonva[n] + " db ");
        }

        System.out.println();
        for (int l = 0; l < hossz2; l++) {
            sort(csere_osszevonva);
            System.out.println(" sorba rendezve : " + csere_osszevonva[l] + " db ");
        }
        System.out.println();
        for (int o = (hossz2 - 1); o >= 0; o--) {
            System.out.println(" csokkeno sorrendben : " + csere_osszevonva[o] + " db ");
        }
    }
}






