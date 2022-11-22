import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static double Globalis_valtozo = 1;

    public static void main(String[] args) {
        //(5 pont) Írjon egy programot amiben deklarál egy
        // globális dupla pontos változót, aminek kezdeti értéke
        // 1. Ezen kívül írjon egy függvényt ami egy parancsot
        // és egy számot vár paraméterként és ezek függvényében értelemszerűen
        // frissíti a globális változó értékét.
        // Az érvényes parancsok: szoroz, oszt, osszead.
        // A main függvényben hívja is meg a függvényt néhány tetszőleges paraméterezéssel.
        System.out.println(" Ez a program osszead,oszt es szoroz ! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg a muvelet szamat, melyet szeretne elvegezni : ");
        kivalasztja_a_muveletet(sc);

    }

    private static void kivalasztja_a_muveletet(Scanner sc) {
        String[] muvelet_kivalasztasa = {"1", "2", "3"};
        System.out.println(muvelet_kivalasztasa[0] + " : szorzas");
        System.out.println(muvelet_kivalasztasa[1] + " : osztas");
        System.out.println(muvelet_kivalasztasa[2] + " : osszeadas");
        int valasztas = sc.nextInt();
        System.out.println(" Kerem adja meg a szamot, mellyel szorozni,osztani vagy osszeadni szeretne ");
        int szam = sc.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Globalis_valtozo = Double.parseDouble(decimalFormat.format(01.00));
        switch (valasztas) {
            case 1 -> {
                System.out.println(" On a szorzast valasztotta");
                Globalis_valtozo = Globalis_valtozo * szam;
                System.out.println(" A szorzas eredmenye : " + Globalis_valtozo);
            }
            case 2 -> {
                System.out.println(" On az osztast valasztotta");
                Globalis_valtozo = Globalis_valtozo / szam;
                System.out.println(" Az osztas eredmenye : " + Globalis_valtozo);
            }
            case 3 -> {
                System.out.println(" On az osszeadast valasztotta");
                Globalis_valtozo = Globalis_valtozo + szam;
                System.out.println(" A szorzas eredmenye : " + Globalis_valtozo);
            }
        }
    }
}