import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Írjon egy programot ami két parancssori argumentumot vár. Az első egy könyvtár elérési útja, a
        //második egy fájl neve. Egy rekurzív függvény segítségével döntse el, hogy van-e olyan fájl a
        //könyvtárban (vagy bármely abban lévő könyvtárban tetszőleges mélységben) bárhol olyan nevű
        //fájl. Ha vannak ilyenek, ezeknek a teljes elérési útját írja ki a consolere.

        Path mappa_eleresi_utvonala = Paths.get("", "_DataFiles").toAbsolutePath();
        String uj_mappa_eleresi_utvonala = mappa_eleresi_utvonala + "/";
        File mappa = mappa_eleresi_utvonala.toFile();
        Scanner sc = new Scanner(System.in);
        String kilepes = "*";
        String fajlok = "";
        RekFajlFolder(uj_mappa_eleresi_utvonala, fajlok);
    }

    private static String RekFajlFolder(String uj_mappa_eleresi_utvonala, String fajlok) throws IOException {
        String kilepes = "*";
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg a letrehozando fajl nevet ! pld alma");
        System.out.println("Ha nincs ilyen fajl,akkor a program letrehozza");
        System.out.println("Ha ki szeretne lepni irjon *-ot");
        while (!Objects.equals(fajlok, kilepes)) {
            fajlok = sc.nextLine();
            if (!Objects.equals(fajlok, kilepes)) {
                Path newDirectory = Files.createDirectories(Path.of(uj_mappa_eleresi_utvonala));
                System.out.println("uj mappa = " + newDirectory);
                Path uj_mappa = Paths.get(uj_mappa_eleresi_utvonala, fajlok, "/");
                Path newFile = Files.createFile(newDirectory.resolve(newDirectory + "/" + fajlok + ".txt"));
                System.out.println("newFile = " + newFile);
            } else {
                System.out.println("Vege");
            }

        }

        return fajlok;
    }
}