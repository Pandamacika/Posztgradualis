import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //Írj egy programot amely feltölt egy 10 elemű tömböt véletlen tört számokkal,
        // kiírja a tömb elemeit, megcseréli a legnagyobb és a legkisebb számot, majd újra kiírja a tömböt.
        System.out.println(" Ez a feladat egy tomb legkissebb es legnagyobb elemet irja ki!");
        int db = 10;
        Random rn = new Random();
        double[] tomb = new double[db];
        double minimum = 0.00;
        double maximum = 0.00;
        for (int i = 0; i < db; i++) {

            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            tomb[i] = Double.parseDouble(decimalFormat.format(rn.nextDouble(10.00)));
        }

        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        System.out.println();
        for (int j = 0; j < db; j++) {
            Arrays.sort(tomb);
            System.out.print(tomb[j] + ",");
            minimum = tomb[0];
            maximum = tomb[db - 1];
        }
        System.out.println();
        System.out.println(" max : " + maximum + " min : " + minimum);
    }
}