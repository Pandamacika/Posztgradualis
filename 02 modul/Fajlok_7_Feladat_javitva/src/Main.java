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
        // kapott fájlból feltölt egy kétdimenziós törtszám tömböt,
        // aminek a második dimenziói változnak.
        // A fájl első sora azt adja meg, hogy a tömb első dimenziója mentén hány elem van.
        // Ez után minden sor egy számmal kezdődik, ami azt mutatja meg, hogy a második dimenzióban
        // a tömb hány elemet tartalmaz abban az elemben. Majd ezek a számok következnek szóközökkel elválasztva.
        //Pl.:
        //azzal egyenértékű, hogy {{1, 2,3, 4 ,5}, {1, 2, 3}}.

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
        int elsoSor = scFileOlvaso.nextInt();
        double[] elso_dimenzio_elemei = new double[elsoSor];
        scFileOlvaso.nextLine();
        int elso_dimenzio_hossza = scFileOlvaso.nextInt();

        for (int i = 0; i < elsoSor; i++) {
            elso_dimenzio_elemei[i] = scFileOlvaso.nextDouble();
        }
        System.out.println(elsoSor);

        for (int i = 0; i < elsoSor; i++) {
            System.out.print(elso_dimenzio_elemei[i] + "\t");
        }
        scFileOlvaso.nextLine();
        int masodik_dimenzio_hossza = scFileOlvaso.nextInt();
        double[] masodik_dimenzio_elemei = new double[masodik_dimenzio_hossza];
        System.out.println();
        // System.out.println(masodik_dimenzio_hossza+"masodik dimenzio hossza");
        for (int i = 0; i < masodik_dimenzio_hossza; i++) {
            masodik_dimenzio_elemei[i] = scFileOlvaso.nextDouble();
        }

        for (int i = 0; i < masodik_dimenzio_hossza; i++) {
            System.out.print(masodik_dimenzio_elemei[i] + "\t");
        }

        double[][] ketdimenzios_tomb = new double[elso_dimenzio_hossza][masodik_dimenzio_hossza];
        for (int i = 0; i < elso_dimenzio_hossza; i++) {
            for (int j = 0; j < masodik_dimenzio_hossza; j++) {
                ketdimenzios_tomb[i][0] = elso_dimenzio_elemei[i];
                ketdimenzios_tomb[1][j] = masodik_dimenzio_elemei[j];
            }
        }
        System.out.println();
        for (int i = 0; i < elso_dimenzio_hossza; i++) {
            for (int j = 0; j < masodik_dimenzio_hossza; j++) {
                System.out.print(ketdimenzios_tomb[i][j] + "\t");
            }
        }
        fr.close();
    }
}