import java.util.Scanner;

public class Main {
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
        int db = 8;
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
        Scanner sc = new Scanner(System.in);
        String kilepes = "*";
        System.out.println(" Kerem adja meg melyik mezore szeretne lepni :");
        String elso_jatekos = sc.nextLine();
        String masodik_jatekos = sc.nextLine();

        for (int i = 0; i < db; i++) {

            for (int j = 0; j < db; j++) {
                if (!(tabla[i][j].equals(kilepes))) {
                    if (elso_jatekos.equals(tabla[i][j])) {
                        System.out.print("_" + "\t");

                    } else if (masodik_jatekos.equals(tabla[i][j])) {
                        System.out.print("?" + "\t");
                    } else {
                        System.out.print(tabla[i][j] + "\t");
                    }

                }

            }
            System.out.println();
        }

    }
}













