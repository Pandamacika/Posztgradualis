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
        int hossz = uj_szoveg.length();
        Szoveget_terit_vissza(uj_szoveg);

        for (int i = 0; i < hossz; i++) {

            System.out.print(uj_szoveg.charAt(hossz - i - 1));
        }

    }

    private static char Szoveget_terit_vissza(String uj_szoveg) {
        int hossz = uj_szoveg.length();
        char eredmeny = uj_szoveg.charAt(hossz-1);
        if (uj_szoveg.charAt(0) != uj_szoveg.charAt(hossz  - 1))
        {
            return 0;
        }
        else {
            return Szoveget_terit_vissza(uj_szoveg.substring(1,hossz-1));
        }

    }

}


