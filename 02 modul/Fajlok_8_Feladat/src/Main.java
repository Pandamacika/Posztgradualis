import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon egy programot, ami a parancssori argumentumaként kapott fájlba kiír egy 100x100-as tömböt
        //a. az előző feladat formátumában szöveges fájlba és
        //b. bináris fájlba, csak a számokat kiírva
        //c. majd írja meg a bináris formátumból való visszaovlasást is.
        //d. Ezen kívül írjon egy ellenörző függvényt, ami a bináris
        // fájlból illetve a szövegesből beolvasott tömböket összehasonlítja.
        System.out.println(" Ez a program egy kapott fajlbol tolt fel egy tombot ! ");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        // String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        Path newDirectory = Files.createDirectories(mappa.toPath());
        Scanner sc = new Scanner(System.in);
        int db = 100;
        String fajlok;
        System.out.println(" Kerem adja meg a fajl eleresi utvonalat : ");
        fajlok = sc.nextLine();
        String kiterjesztes_txt = "Proba.txt";
        String kiterjesztes_bin = "Proba.dat";
        Fajlt_Keszit(newDirectory, db, fajlok, kiterjesztes_txt);
        Fajlt_Keszit(newDirectory, db, fajlok, kiterjesztes_bin);
        System.out.println();
        Fajlt_olvas(db, fajlok, kiterjesztes_bin);


    }

    private static void Fajlt_olvas(int db, String fajlok, String kiterjesztes_bin) throws IOException {
        FileReader fr = new FileReader(fajlok + kiterjesztes_bin);
        Scanner scFileOlvaso = new Scanner(fr);
        int[][] tomb = new int[db][db];
        for (int i = 1; i < db; i++) {
            for (int j = 1; j < db; j++) {

                tomb[i][j] = scFileOlvaso.nextInt();
                System.out.print(tomb[i][j] + "\t");
                if (j % 4 == 0) {
                    System.out.println();
                }
            }
        }


        fr.close();
    }

    private static void Fajlt_Keszit(Path newDirectory, int db, String fajlok, String kiterjesztes_txt) throws IOException {
        boolean mielott_fajlt_keszitene = Files.exists(Path.of(fajlok + kiterjesztes_txt));
        if (!mielott_fajlt_keszitene) {
            Path letrehozandoFajl = Files.createFile(newDirectory.resolve(kiterjesztes_txt));
            File newFile = letrehozandoFajl.toFile();
            FileWriter fw = new FileWriter(newFile);
            String[][] osszeg = new String[db][db];
            for (int i = 1; i < db; i++) {
                for (int j = 1; j < db; j++) {
                    osszeg[i][j] = String.valueOf(i + j);

                }
            }
            for (int i = 1; i < db; i++) {
                for (int j = 1; j < db; j++) {
                    System.out.print(osszeg[i][j] + "\t");
                    if (j % 4 == 0) {
                        System.out.println();
                    }
                    fw.write(String.valueOf(osszeg[i][j]) + "\t");

                }
            }

            fw.close();

        } else if (mielott_fajlt_keszitene) {
            System.out.println("Ez a fajl mar letezik");

        }
    }
}