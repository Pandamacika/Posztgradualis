import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    //Írja ki a program prancssori argumentumaként
    // megkapott könyvtárban lévő összes könyvtár és
    // fájl nevét. Egyszer a könyvtrárakat, utána a fájlokat.
    public static void main(String[] args) {
        System.out.println(" Ez a program mappa- es fajlneveket ir ki ! ");
        System.out.println(" Kerem adja meg,hogy melyik mappa tartalmat szeretne kiratni ! Teljes eleresi utvonal szukseges. ");
        System.out.println(" A mappak zold szinnel,a fajlok lila szinnel fognak megjelenni");
        Scanner sc = new Scanner(System.in);
        String bekert_eleresi_utvonal = sc.nextLine();
        Path bekert_eleresi_utvonal_mappaja = Paths.get(bekert_eleresi_utvonal).toAbsolutePath();
        File bekert_mappa = bekert_eleresi_utvonal_mappaja.toFile();
        File[] bekert_mappa_tartalma = bekert_mappa.listFiles();
        Kiirja_a_mappakat(bekert_mappa_tartalma);
        System.out.println();
        Path mappa_eleresi_utvonala = Paths.get("").toAbsolutePath();
        File mappa = mappa_eleresi_utvonala.toFile();
        File[] mappa_tartalma = mappa.listFiles();
        Kiirja_a_mappakat(mappa_tartalma);

    }

    private static void Kiirja_a_mappakat(File[] mappa_tartalma) {
        for (int i = 0; i < mappa_tartalma.length; i++) {
            if (mappa_tartalma[i].isDirectory()) {
                System.out.println(ConsoleColors.GREEN_BOLD + " mappa : " + ConsoleColors.GREEN_BOLD + mappa_tartalma[i]);
            }
        }
        for (int i = 0; i < mappa_tartalma.length; i++) {
            if (mappa_tartalma[i].isFile()) {
                System.out.println(ConsoleColors.PURPLE + " fajl: " + ConsoleColors.PURPLE + mappa_tartalma[i]);

            }
        }
    }

    public class ConsoleColors {
        public static final String RESET = "\033[0m";  // Text Reset
        public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
        public static final String PURPLE = "\033[0;35m";  // PURPLE

    }
}
