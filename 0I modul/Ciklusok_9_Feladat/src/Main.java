import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekér egy szöveget.
        // Ezt a szöveget vesszők mentén feldarabolja,
        // majd kiírja az összes előforduló szót, de csak egyszer.
        // Pl.: „alma, körte, alma, kukorica” bemenetre „alma, körte, kukorica” íródik a képernyőre.
        System.out.println(" Ez a program egy szoveget oszt reszekre . ");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        int hossz = szoveg.length();
        System.out.print("A szavak hossza : " + hossz);
        System.out.println();
        System.out.print("A szavak  : " + szoveg);
        String vesszo = ",";
        String csere = "";
        System.out.println();
        String[] uj_szoveg = szoveg.split(vesszo);
        System.out.println(Arrays.toString(uj_szoveg));
        int db = (int) Arrays.stream(uj_szoveg).count();
        System.out.println(" A tomb elemei :" + db);
        for (int i = 0; i < db; i++) {
            if (i == 0) {
                for (int k = (i + 1); k < db; k++) {
                    if (Objects.equals(uj_szoveg[i], uj_szoveg[k])) {
                        uj_szoveg[k] = csere;
                    }
                }
            }
            // System.out.println(" A szavak ismetles nelkul : " + uj_szoveg[i]);
            if (i == 1) {
                for (int k = (i + 1); k < db; k++) {
                    if (Objects.equals(uj_szoveg[i], uj_szoveg[k])) {
                        uj_szoveg[k] = csere;
                    }
                }
            }
            if (i == 2) {
                for (int k = (i + 1); k < db; k++) {
                    if (Objects.equals(uj_szoveg[i], uj_szoveg[k])) {
                        uj_szoveg[k] = csere;
                    }
                }
            }
            if (i == 3) {
                for (int k = (i + 1); k < db; k++) {
                    if (Objects.equals(uj_szoveg[i], uj_szoveg[k])) {
                        uj_szoveg[k] = csere;
                    }
                }
            }
            System.out.println(" A szavak ismetles nelkul : " + uj_szoveg[i]);
        }
    }
}