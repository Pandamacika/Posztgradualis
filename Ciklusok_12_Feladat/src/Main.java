import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot amely felölt egy 10 elemű egész szám tömböt 2 és 15000 közötti véletlen egész számokkal,
        // kiírja a tömb elemeit sorrendben vesszővel elválasztva, megcseréli a legkisebb és a legnagyobb element,
        // majd újra kiírja a tömb elemeit.
        //Mivel a számok hossza eltérő, ezért a kiírás láthatóan igénytelennek hat.
        // Gondoskodj róla, hogy a két kiírás egymás alatti sorokban legyen,
        // és a számokat elválasztó vesszők egymás fölé legyenek igazítva. (Használd fel az előző feladat kódját.)
        System.out.println(" Ez a feladat egy tomb legkissebb es legnagyobb elemet irja ki!");
        int db = 10;
        Random rn = new Random();
        double[] tomb = new double[db];
        double minimum = 0.00;
        double maximum = 0.00;
        for (int i = 0; i < db; i++) {

            DecimalFormat decimalFormat = new DecimalFormat("00000.00");
            tomb[i] = Double.parseDouble(decimalFormat.format(rn.nextDouble(15000 - 2)));
        }
        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        System.out.println();
        System.out.println();
        for (int j = 0; j < db; j++) {
            Arrays.sort(tomb);
            minimum = tomb[0];
            maximum = tomb[db - 1];
            NumberFormat formatter = new DecimalFormat("00000.00");
            String szamok = formatter.format(tomb[j]);
            System.out.println(szamok + ",");
        }
        System.out.println();
        System.out.println(" max : " + maximum + " min : " + minimum);
    }


}