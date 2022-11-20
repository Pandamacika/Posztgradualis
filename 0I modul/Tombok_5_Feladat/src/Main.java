import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot amely feltölt egy 3 elemű tömböt véletlen számokkal,
        // kiírja a tömb elemeit, megcseréli az első és az utolsó számot, majd újra kiírja a tömböt.
        System.out.println(" Ez a program egy tomb elemeit csereli fel . ");
        Random rn = new Random();
        int[] tomb = new int[3];
        for (int i = 0; i < 3; i++) {
            tomb[i] = rn.nextInt(10);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(tomb[i] + ",");
        }
        System.out.println();
        int csere;
        csere = tomb[0];
        tomb[0] = tomb[2];
        tomb[2] = csere;
        for (int i = 0; i < 3; i++) {
            System.out.print(tomb[i] + ",");
        }
    }
}