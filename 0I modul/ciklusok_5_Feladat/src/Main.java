
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekér két karakterláncot,
        // majd kiírja, hogy a második karakterlánc hánszor
        // szerepel az elsőben. Ezt kétféleképpen is számolja meg:
        //i.	Átfedésekkel: pl: a „abrabrabra”-ban 3-szor szerepel az „abra”, ha átfedéseket megengedünk.
        //ii.	Átfedések nélkül: pl: a „abrabrabra”-ban 2-szor szerepel az „abra”, ha átfedéseket nem engedünk meg.
        System.out.println(" Ez a program ket karakterlancot hasonlit ossze : !");
        Scanner sc = new Scanner(System.in);
        String[] szoveg = new String[2];
        System.out.println(" Kerem az elso karakterlancot : ");
        szoveg[0] = sc.nextLine();
        System.out.println(" Kerem adja meg a masodik karakterlancot : ");
        szoveg[1] = sc.nextLine();
        System.out.println(" A tombe elemei : " + szoveg[0] + szoveg[1]);
        int hossz = szoveg[0].length();
        int hossz2 = szoveg[1].length();
        String[] elso_szo_betui = new String[hossz];
        String[] masodik_szo_betui = new String[hossz2];
        int db = 0;

        if (szoveg[1].compareTo(szoveg[0]) < 0) {
            for (int j = 0; j < hossz; j++) {
                char betu = szoveg[0].charAt(j);
                elso_szo_betui[j] = String.valueOf(betu);

            }

            for (int k = 0; k < hossz2; k++) {
                char betu2 = szoveg[1].charAt(k);
                masodik_szo_betui[k] = String.valueOf(betu2);

            }

        }
        for (int i = 0; i < hossz; i++) {
            if (szoveg[0].contains(szoveg[1])) {
                db++;
            }
        }
        System.out.println(" Az elso szo betui : ");
        for (int i = 0; i < hossz; i++) {
            System.out.print(elso_szo_betui[i] + ",");
        }
        System.out.println();
        System.out.println(" A masodik szo betui : ");
        for (int i = 0; i < hossz2; i++) {
            System.out.print(masodik_szo_betui[i] + ",");
        }
        System.out.println();
        // String masodik_szo = szoveg[0].substring(0, hossz2);
        System.out.println(" A masadik szo meg van az elsoben :" + db / 4);
        int darab = 0;
        for (int l = 0; l < hossz; l++) {
            darab = hossz / hossz2 + 1;
        }

        System.out.println(" A masadik szo meg van az elsoben :" + darab);
    }

}



