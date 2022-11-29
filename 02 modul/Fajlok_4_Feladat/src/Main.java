import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írj egy programot ami addig kér be könyvtárneveket,
        // ameddig abban pont nem lesz (pl x, y, a.txt),
        //majd ez alapján létrehozza az aktuális könyvtárban az x/y/a.txt fájlt.
        System.out.println(" Ez a program txt fajlokat hoz letre,amig pontot nem kap eredmenykent ! ");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();

        Scanner sc = new Scanner(System.in);
        String kilepes = ".";
        String fajlok = "";
        while (!Objects.equals(fajlok, kilepes)) {
            fajlok = sc.nextLine();

            if (!Objects.equals(fajlok, kilepes)) {
                Path newDirectory = Files.createDirectories(Path.of(uj_mappa_eleresi_utvonala));
                //System.out.println("uj mappa = " + newDirectory);
                boolean mielott_fajlt_keszitene = Files.exists(Path.of(newDirectory + "/" + fajlok + ".txt"));


                if (!mielott_fajlt_keszitene) {
                    Path newFile = Files.createFile(newDirectory.resolve(newDirectory + "/" + fajlok + ".txt"));
                    // System.out.println("newFile = " + newFile);
                } else {
                    System.out.println(" Ez a fajl mar letezik, kerem irjon be uj nevet :");
                    if (!Objects.equals(fajlok, kilepes)) {
                        fajlok = sc.nextLine();
                        Path newFile = Files.createFile(newDirectory.resolve(newDirectory + "/" + fajlok + ".txt"));
                    }


                }
            } else {
                System.out.println("Vege");
            }
        }

    }
}