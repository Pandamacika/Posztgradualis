import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    //Írjunk egy programot ami az aktuális könyvtárban létrehoz
    // egy _DataFiles könyvtárat, majd a consoleról *-ig beolvasott nevű fájlokat
    // hoz létre ebben a könyvtárban.
    //(Próbáld ki, hogy mi történik, ha olyan fájlneveket adsz meg,
    // amik nem kanonikus utak. Mit gondolsz, miért lehet ebből baj?)
    public static void main(String[] args) throws IOException {
        System.out.println(" Ez a program fajlokat hoz letre");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        File mappa = mappa_eleresi_utvonala.toFile();
        mappa.mkdirs();

        Scanner sc = new Scanner(System.in);
        String kilepes = "*";
        String letrehozandoFileNeve = "";
        Path newDirectory = Files.createDirectories(mappa_eleresi_utvonala);
        System.out.println("uj mappa = " + newDirectory);


        while (!letrehozandoFileNeve.equals(kilepes)) {
            letrehozandoFileNeve = sc.nextLine();
            if (!Objects.equals(letrehozandoFileNeve, kilepes)) {
                Path letrehozandoFileUtja = Paths.get(mappa_eleresi_utvonala.toString(), letrehozandoFileNeve);
                File newFile = letrehozandoFileUtja.toFile();
                newFile.createNewFile();
                System.out.println("newFile = " + newFile);
            } else {
                System.out.println("Vege");
            }
        }


    }
}