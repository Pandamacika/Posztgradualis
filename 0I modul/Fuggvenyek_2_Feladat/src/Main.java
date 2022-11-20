import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Oldd meg a 6.12 feladatot majd refaktoráld a megoldásodat, hogy függvények felhasználásával oldd meg,
        // jelentősen csökkentve a kód mennyiségét és javítva az olvashatóságot.
        //Használd az IDE beépített refaktorálási funkcióit (jobb klick, refactor, extract method).
        System.out.println(" Ez a feladat egy tomb legkissebb es legnagyobb elemet irja ki!");
        int db = 10;
        Random rn = new Random();
        double[] tomb = new double[db];
        double minimum = 0.00;
        double maximum = 0.00;
        for (int i = 0; i < db; i++) {

            extracted(rn, tomb, i);
        }
        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        System.out.println();
        System.out.println();
        for (int j = 0; j < db; j++) {
            extracted(tomb);
            minimum = tomb[0];
            maximum = tomb[db - 1];
            String szamok = getString(tomb[j]);
            System.out.println(szamok + ",");
        }
        System.out.println();
        System.out.println(" max : " + maximum + " min : " + minimum);
    }

    private static void extracted(Random rn, double[] tomb, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("00000.00");
        tomb[i] = Double.parseDouble(decimalFormat.format(rn.nextDouble(15000 - 2)));
    }

    private static String getString(double tomb) {
        NumberFormat formatter = new DecimalFormat("00000.00");
        return formatter.format(tomb);
    }

    private static void extracted(double[] tomb) {
        Arrays.sort(tomb);
    }


}