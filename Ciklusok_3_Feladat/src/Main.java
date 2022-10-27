
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Rendes palindrom teszt: Írjon programot amely beolvas egy karakterláncot
        // és arról eldönti, hogy palindróm-e (egy karakterlánc akkor palindróm,
        // ha visszafelé olvasva is ugyan az mint előre, pl: Rád rohan a hordár).
        // A kis- és nagybetűk ne jelentsenek különbséget, valamint a szóközök se számítsanak.
        //Tesztadatok:
        System.out.println("Palindrom teszt");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        String uj_szoveg = szoveg.replace(" ", "");
        uj_szoveg = uj_szoveg.replace(".", "");
        uj_szoveg = uj_szoveg.replace(",", "");
        uj_szoveg = uj_szoveg.replace(":", "");
        uj_szoveg = uj_szoveg.replace("?", "");
        uj_szoveg = uj_szoveg.toLowerCase();
        System.out.println(uj_szoveg);
        int betuk_szama = uj_szoveg.length();
        StringBuilder szoveg_betui_megforditva = new StringBuilder();


        for (int i = betuk_szama - 1; i >= 0; i--) {
            char iDikKarakter = uj_szoveg.charAt(i);
            szoveg_betui_megforditva.append(iDikKarakter);


        }

        System.out.println(szoveg_betui_megforditva);
        int a = 0;
        for (int j = 0; j < betuk_szama; j++) {

            if (uj_szoveg.charAt(j) != szoveg_betui_megforditva.charAt(j)) {
                a = a + 1;
            } else
                a = 0;
        }

        System.out.println("ures karakter nelkul : " + szoveg_betui_megforditva);
        if (a != 0) {
            System.out.println(" Ez  nem palindrom ! " + uj_szoveg + " != " + szoveg_betui_megforditva);
        } else {
            System.out.println(" Ez palindrom ! " + uj_szoveg + " = " + szoveg_betui_megforditva);
        }
    }
}