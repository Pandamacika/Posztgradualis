
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
        for (int i = 0; i < mappa_tartalma.length; i++) {
            if (mappa_tartalma[i].isDirectory()) {
                System.out.println(" mappa : " + mappa_tartalma[i]);
            }
        }
        for (int i = 0; i < mappa_tartalma.length; i++) {
            if (mappa_tartalma[i].isFile()) {
                System.out.println(" fajl: " + mappa_tartalma[i]);

            }
        }

    }
    }