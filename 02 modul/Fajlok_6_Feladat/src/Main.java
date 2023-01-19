import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon egy programot, ami a parancssori argumentumaként
        // kapott fájlból feltölt egy karakterláncokból álló tömböt.
        // A fájl első sorában a feltöltendő tömb hossza van.
        // Utána egy üress sor. Majd a tömb elemei soronként.

        System.out.println(" Ez a program egy kapott fajlbol tolt fel egy tombot ! ");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        // String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        Path newDirectory = Files.createDirectories(mappa.toPath());
        Scanner sc = new Scanner(System.in);

        String fajlok;
        System.out.println(" Kerem adja meg a fajl eleresi utvonalat : ");
        fajlok = sc.nextLine();
        FileReader fr = new FileReader(fajlok);
        Scanner scFileOlvaso = new Scanner(fr);
        String elsoSor = scFileOlvaso.nextLine();
        String uresSor = scFileOlvaso.nextLine();
        System.out.println(elsoSor);
        System.out.println(uresSor);
        String[] tomb = new String[Integer.parseInt(elsoSor)];
        for (int i = 0; i < Integer.parseInt(elsoSor); i++) {
            tomb[i] = scFileOlvaso.nextLine();
        }
        for (int i = 0; i < Integer.parseInt(elsoSor); i++) {
            System.out.print(tomb[i] + ",");
        }
        fr.close();
    }
}