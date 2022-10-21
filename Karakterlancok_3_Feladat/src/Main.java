import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj programot ami beolvas két karakterláncot (vezetéknévnek és keresztnévnek),
        // majd ebből kiír egy szépen formázott nevet.
        // A szépen formázott azt jelenti, hogy a vezetéknév és a keresztnév első betűje nagy betű,
        // a többi mind kicsi.
        System.out.println(" Ez a program beolvas neveket es osszeilleszti . ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg a vezetknevet : ");
        String elso = sc.nextLine();
        System.out.println(" Kerem adja meg a keresztnevet : ");
        String masodik = sc.nextLine();
        char elso_betu = elso.charAt(0);
        char elso_betu_masodik = masodik.charAt(0);
        String elso_nagy_betu = String.valueOf(elso_betu);
        String masodik_nagy_betu = String.valueOf(elso_betu_masodik);
        String ossz_nev;
        System.out.println(" A vezeteknev elso betuje : " + elso_nagy_betu.toUpperCase());
        ossz_nev = elso_nagy_betu.toUpperCase() + elso.substring(1) + " " + masodik_nagy_betu.toUpperCase() + masodik.substring(1);
        System.out.println(" A teljes nev : " + ossz_nev);

    }
}