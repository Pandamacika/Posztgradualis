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
        System.out.println(" Ez a program konyvtarakat es egy fajlt hoz letre ! ");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();

        Scanner sc = new Scanner(System.in);
        String kilepes = ".txt";
        String fajlok = "";
        while (!Objects.equals(fajlok, kilepes)) {
            fajlok = sc.nextLine();

            if (!Objects.equals(fajlok, kilepes)) {
                Path newDirectory = Files.createDirectories(Path.of(uj_mappa_eleresi_utvonala));
                System.out.println("uj mappa = " + newDirectory);
                Path uj_mappa = Paths.get(uj_mappa_eleresi_utvonala,fajlok,"/");
                Path newFile = Files.createDirectories(newDirectory.resolve(newDirectory+"/"+fajlok+"/"));
                System.out.println("newFile = " + newFile);
            } else {
                System.out.println("Vege");
            }
        }

    }
}