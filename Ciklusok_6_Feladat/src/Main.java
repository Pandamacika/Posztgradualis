
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekér egy karakterláncot
        // és az első betű összes előfordulását kicseréli !-re,
        // kétféle képpen. Egyik esetben karakterláncfeldolgozó műveletekkel,
        // a másik esetben egy Java beépített metódus használatával (google a barátod).
        // Ha jól dolgozol, a két megoldás azonos kell legyen.
        System.out.println(" Ez a program kicsereli az tobbszor elofordulo elso betut ! jelre . ");
        Scanner sc = new Scanner(System.in);
        String[] szoveg = new String[1];
        System.out.println(" Kerem adja meg a  karakterlancot : ");
        szoveg[0] = sc.nextLine();
        int hossz = szoveg[0].length();
        String[] szoveg_betui = new String[hossz];


        for (int i = 0; i < hossz; i++) {
            char betu = szoveg[0].charAt(i);
            szoveg_betui[i] = String.valueOf(betu);
        }
        System.out.println(" A szoveg betui :");
        for (int j = 0; j < hossz; j++) {
            szoveg_betui[j] = szoveg_betui[j].toLowerCase();
            System.out.print(szoveg_betui[j] + ",");
        }
        String cserelendo_betu = szoveg_betui[0];
        for (int j = 0; j < hossz; j++) {
            if (cserelendo_betu.equals(szoveg_betui[j])) {
                szoveg_betui[j] = "!";
            }
        }
        System.out.println();
        for (int j = 0; j < hossz; j++) {
            System.out.print(szoveg_betui[j] + ",");
        }

    }
}