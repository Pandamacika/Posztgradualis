import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írjon egy programot ami bekér egy számot,
        // majd létrehoz egy ekkora tömböt amit megtölt véletlen számokkal.
        // Ezek után egy másik tömbbe számoljuk meg,
        // hogy az adott pozícióban lévő elemhez képest az eredeti tömbben hány nagyobb elem volt.
        //A tömbhossz megadása utáni futási időt mérd meg és az algoritmus futása után
        // írd ki mp-ben. Példa: első tömb: {0.7, 0.6, 0.3, 0.9, 0.2, 0.8}
        //                    második tömb: { 2,   3, 	4,     0, 5,	1}
        System.out.println(" Ez a program egy tomb elemeit vizsgalja, melyet veletlen szamokkal tolt fel!");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg,hogy hany eleme legyen a tombnek : ");
        int db = sc.nextInt();
        Random rn = new Random();
        feltolti_a_tombot(db, rn);


    }

    private static void feltolti_a_tombot(int db, Random rn) {
        double[] tomb = new double[db];
        for (int i = 0; i < db; i++) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            tomb[i] = Double.parseDouble(decimalFormat.format(rn.nextDouble(1.00)));
            System.out.println(tomb[i]);

        }
        int[] darabszam = new int[db];
        for (int i = 0; i < db; i++) {

            int megszamolja_a_szamokat = 0;
            for (int j = 0; j < db; j++) {
                if ((tomb[i] < tomb[j]) && (tomb[i] != tomb[j])) {
                    megszamolja_a_szamokat = megszamolja_a_szamokat + 1;

                }

            }
            darabszam[i] = megszamolja_a_szamokat;

        }
        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < db; i++) {
            System.out.print("  " + darabszam[i] + ", ");
        }

    }
}