
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //Írja ki a program aktuális könyvtárában lévő összes
        // könyvtár és fájl nevét. Egyszer a könyvtrárakat, utána a fájlokat.
        System.out.println(" Ez a feladat csoportositja a mappakat es a fajlokat ");
        Path mappa_eleresi_utvonala = Paths.get("").toAbsolutePath();
        File mappa = mappa_eleresi_utvonala.toFile();
        File[] mappa_tartalma = mappa.listFiles();

        for (File file : mappa_tartalma) {
            if (file.isDirectory()) {
                System.out.println(" mappa : " + file);
            }
        }
        for (File file : mappa_tartalma) {
            if (file.isFile()) {
                System.out.println(" fajl: " + file);

            }
        }

    }
}