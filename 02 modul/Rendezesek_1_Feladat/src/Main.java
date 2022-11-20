import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon egy programot ami az aktuális könyvtárban lévő bemenet.txt fájlból felölt egy karakterlánc
        //tömböt. A fájl első sorában a későbbi sorok száma van, utána soronként egy-egy karakterlánc.
        //a. Rendezze a tömböt buborék rendezéssel.
        //b. Rendezze a tömböt kiválasztásos rendezéssel.
        //c. Rendezze a tömböt beszúrásos rendezéssel.
        //A rendezést a karakterláncok első betűje alapján végezze el.
        System.out.println(" Ez a program egy fajlbol beolvas egy karakterlancot !");
        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        mappa.mkdirs();
        Path newDirectory = Files.createDirectories(Path.of(uj_mappa_eleresi_utvonala));
        System.out.println("uj mappa = " + newDirectory);
        String bemenet = "";
        Scanner sc = new Scanner(System.in);
        bemenet = sc.nextLine();
        Path newFile = Files.createFile(newDirectory.resolve(bemenet + ".txt"));
        System.out.println("newFile = " + newFile);
        FileWriter fw = new FileWriter(String.valueOf(newFile.toAbsolutePath()));
        fw.write("6");
        fw.write("\n");
        fw.write("alma");

        fw.close();
    }
}