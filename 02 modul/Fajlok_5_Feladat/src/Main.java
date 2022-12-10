import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String a_teljes_sor;

    public static void main(String[] args) throws IOException {
        //Írjon egy programot, ami a parancssori argumentumaként kapott
        // fájlból feltölt egy egész számokból álló tömböt.
        // A fájl első sorában a feltöltendő tömb hossza van.
        // Utána egy üress sor. Majd a tömb elemei szóközzel elválasztva.

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
        char[] tomb = new char[Integer.parseInt(elsoSor)];
        String tomb_elemei = scFileOlvaso.nextLine();
        tomb_elemei = tomb_elemei.replace(" ", ",");
        System.out.println(tomb_elemei);
        int hossz = tomb_elemei.length();
        String vesszo = ",";
        a_teljes_sor = tomb_elemei.trim();
        System.out.println(a_teljes_sor);
        StringBuilder szoveg_betui = new StringBuilder();
        char Karakterek;
        for (int i = 0; i < hossz; i++) {

            Karakterek = a_teljes_sor.charAt(i);
            szoveg_betui.append(Karakterek);
        }
        for (int i = 0; i < hossz; i++) {

            if (!String.valueOf(szoveg_betui.charAt(i)).equals(vesszo)) {

                szoveg_betui.getChars(0, Integer.parseInt(elsoSor), tomb, 0);

            } else if (String.valueOf(szoveg_betui.charAt(i)).equals(vesszo)) {

                szoveg_betui.deleteCharAt(i);
                hossz--;
                szoveg_betui.getChars(0, Integer.parseInt(elsoSor), tomb, 0);
            }


        }

        System.out.println();
        System.out.println(szoveg_betui);

        for (int i = 0; i < Integer.parseInt(elsoSor); i++) {
            System.out.print(tomb[i] + ",");
        }
        fr.close();
        System.out.println();
        System.out.println("Vege");
    }


}
