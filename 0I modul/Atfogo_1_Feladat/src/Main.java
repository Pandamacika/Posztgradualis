

import java.util.Scanner;

public class Main {
    public static String elso_jatekos = "";
    public static String masodik_jatekos = "";
    public static int db = 8;
    public static String kilepes = "*";

    public static void main(String[] args) {
        //Írjon egy olyan programot, amivel sakkozni lehet.
        // A program a képernyőre karakterekkel kirajzolja az induló állást,
        // majd egyszer a fekete, egyszer a fehér játékostól kéri be a következő lépését
        // (melyik mezőről melyikre szeretne lépni). Ha *-ot ad meg a játékos, akor feladta a mérkőzést.
        //A program ellenőrizze minden lépésnél, hogy azt a bábú megteheti-e
        // (a típusa engedi, király nem kerül sakkba,...).
        //A kiírásban jelülje _-al a fekete üres cellák helyét és szóközzel a fehéreket.
        // Minden bábúnak válasszon egy betűt (F és f a futónak, és így tovább).
        // A kis betűs lehet a fehér a nagy a fekete jelölője.
        System.out.println(" Sakk !");
        String[][] oszlop = {{"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"},
                {"A", "B", "C", "D", "E", "F", "G", "H"}};
        String[][] sor = {{"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "2", "3", "4", "5", "6", "7", "8"}};

        String[][] tabla = getStrings(db, oszlop, sor);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Kerem adja meg melyik mezore szeretne lepni :");
        for (int i = 0; i < 100; i++) {
            if ((!elso_jatekos.equals(kilepes)) && (!masodik_jatekos.equals(kilepes))) {
                jatek(tabla, sc);
            } else {
                break;
            }
        }
    }

    private static void jatek(String[][] tabla, Scanner sc) {
        elso_jatekos = sc.nextLine();
        masodik_jatekos = sc.nextLine();

        for (int i = 0; i < db; i++) {
             for (int j = 0; j < db; j++) {
                    if (elso_jatekos.equals(tabla[i][j])) {
                        tabla[i][j] = ConsoleColors.BLUE_BOLD + tabla[i][j]  + ConsoleColors.RESET;
                        System.out.print(tabla[i][j]+"\t");
                    } else if (masodik_jatekos.equals(tabla[i][j])) {
                        tabla[i][j] = ConsoleColors.GREEN_BOLD + tabla[i][j]  + ConsoleColors.RESET;
                        System.out.print(tabla[i][j]+"\t");
                    } else {
                        System.out.print(tabla[i][j] + "\t");
                    }
                }
                System.out.println();
            }

        }



    private static String[][] getStrings(int db, String[][] oszlop, String[][] sor) {
        String[][] tabla = new String[db][db];

        for (int i = 0; i < db; i++) {
            for (int j = 0; j < db; j++) {
                tabla[i][j] = oszlop[i][i] + sor[j][j];
            }
        }
        for (int i = 0; i < db; i++) {
            for (int j = 0; j < db; j++) {
                System.out.print(tabla[i][j] + "\t");

            }
            System.out.println();
        }
        return tabla;
    }

    public class ConsoleColors {
        public static final String RESET = "\033[0m";  // Text Reset
        public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
        public static final String BLUE_BOLD = "\033[1;34m";   // BLUE

    }

}













