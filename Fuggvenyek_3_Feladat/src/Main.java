
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Oldd meg a 6.13 feladatot majd refaktoráld a megoldásodat,
        // hogy függvények felhasználásával oldd meg, jelentősen csökkentve a kód mennyiségét
        // és javítva az olvashatóságot. Figyelj külön a változók logikus kategorizálására
        // (globális, lokális, paraméter,...).
        //Használd az IDE beépített refaktorálási funkcióit (jobb klick, refactor, extract method).
        System.out.println(" Ez a program egy tomb elemeit rendezi!");
        int db = 5;
        Random rn = new Random();
        int[] tomb = new int[db];
        Scanner sc = new Scanner(System.in);
        String kilepes = "*";
        extracted(db, rn, tomb);
        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        String[] szamok = new String[50];
        System.out.println();
        int darabszam = 0;
        String ures = "";
        System.out.println(" Kerem adja meg a szamokat * vegjelig : ");
        darabszam = getDarabszam(sc, kilepes, szamok, darabszam, ures);
        System.out.println("Az osszesen beolvasott szamoka szama : " + darabszam);
        extracted(szamok, darabszam, ures);
        System.out.println();
        System.out.print(" A tomb javitva : ");
        extracted(db, tomb, szamok, darabszam, ures);
        for (int m = 0; m < db; m++) {
            System.out.print(tomb[m] + ",");
        }

    }

    private static void extracted(int db, int[] tomb, String[] szamok, int darabszam, String ures) {
        for (int l = 0; l <= darabszam; l++) {
            for (int k = 0; k < db; k++) {
                boolean szam_betu = szamok[l].chars().allMatch(Character::isDigit);
                if ((szam_betu) && (!szamok[l].equals(ures))) {
                    if (Integer.parseInt(szamok[l]) > tomb[k]) {
                        tomb[k] = Integer.parseInt(szamok[l]);
                        Arrays.sort(tomb);
                    }
                }
            }
        }
    }

    private static void extracted(String[] szamok, int darabszam, String ures) {
        for (int k = 0; k <= darabszam; k++) {
            boolean szam_betu = szamok[k].chars().allMatch(Character::isDigit);
            if ((szam_betu) && (!szamok[k].equals(ures))) {
                System.out.print(szamok[k] + ",");
            }
        }
    }

    private static int getDarabszam(Scanner sc, String kilepes, String[] szamok, int darabszam, String ures) {
        for (int j = 0; j < 50; j++) {
            szamok[j] = sc.nextLine();
            if (!Objects.equals(szamok[j], kilepes)) {
                boolean szam_betu = szamok[j].chars().allMatch(Character::isDigit);
                if ((szam_betu) && (!szamok[j].equals(ures))) {
                    // System.out.println(szamok[j]);
                    if ((szamok[j] != null)) {
                        darabszam++;
                    }
                } else {
                    System.out.println(" Csak szamokat es a * jelt fogadjuk el");
                    System.out.println(" Kerem adja meg a szamokat * vegjelig : ");
                }
            } else {
                System.out.println(" Vege ");
                break;
            }
        }
        return darabszam;
    }

    private static void extracted(int db, Random rn, int[] tomb) {
        for (int i = 0; i < db; i++) {
            tomb[i] = rn.nextInt(10);
            Arrays.sort(tomb);
        }
    }
}
