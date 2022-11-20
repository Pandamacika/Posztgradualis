import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    //Írja ki a program prancssori argumentumaként
    // megkapott könyvtárban lévő összes könyvtár és
    // fájl nevét. Egyszer a könyvtrárakat, utána a fájlokat.
    public static void main(String[] args) {
        System.out.println(" Ez a program mappa- es fajlneveket ir ki ! ");
        Path mappa_eleresi_utvonala = Paths.get("D:\\Posztgradualis-2022").toAbsolutePath();
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
