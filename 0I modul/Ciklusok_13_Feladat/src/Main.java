
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami előszőr feltölt egy 5 elemű tömböt véletlen számokkal,
        // majd rendezi és kiírja. Ezek után addig kér be adatot a felhasználótól,
        // amíg az *-ot nem ad meg. Ha nem számot adott meg, akkor kiírja, hogy csak számokat vagy *-ot fogadunk el.
        // Ha számot adott meg, akkor a tömb azon elemét amelynek értéke a legközelebb esik a megadott új számhoz
        // kicseréli az új számra, rendezi a tömböt, majd kiírja.
        System.out.println(" Ez a program egy tomb elemeit rendezi!");
        int db = 5;
        Random rn = new Random();
        int[] tomb = new int[db];
        Scanner sc = new Scanner(System.in);
        String kilepes = "*";
        for (int i = 0; i < db; i++) {
            tomb[i] = rn.nextInt(10);
            Arrays.sort(tomb);
        }
        for (int i = 0; i < db; i++) {
            System.out.print(tomb[i] + ",");
        }
        String[] szamok = new String[50];
        System.out.println();
        int darabszam = 0;
        String ures = "";
        System.out.println(" Kerem adja meg a szamokat * vegjelig : ");
        for (int j = 0; j < 50; j++) {
            szamok[j] = sc.nextLine();
            if (!Objects.equals(szamok[j], kilepes)) {
                boolean szam_betu = szamok[j].chars().allMatch(Character::isDigit);
                if ((szam_betu) && (!szamok[j].equals(ures))) {
                    // System.out.println(szamok[j]);
                    if ((szamok[j] != null)) {
                        darabszam++;
                    }
                } else {
                    System.out.println(" Csak szamokat es a * jelt fogadjuk el");
                    System.out.println(" Kerem adja meg a szamokat * vegjelig : ");
                }
            } else {
                System.out.println(" Vege ");
                break;
            }
        }
        System.out.println("Az osszesen beolvasott szamoka szama : " + darabszam);
        for (int k = 0; k <= darabszam; k++) {
            boolean szam_betu = szamok[k].chars().allMatch(Character::isDigit);
            if ((szam_betu) && (!szamok[k].equals(ures))) {
                System.out.print(szamok[k] + ",");
            }
        }
        System.out.println();
        System.out.print(" A tomb javitva : ");
        for (int l = 0; l <= darabszam; l++) {
            for (int k = 0; k < db; k++) {
                boolean szam_betu = szamok[l].chars().allMatch(Character::isDigit);
                if ((szam_betu) && (!szamok[l].equals(ures))) {
                    if (Integer.parseInt(szamok[l]) > tomb[k]) {
                        tomb[k] = Integer.parseInt(szamok[l]);
                        Arrays.sort(tomb);

                    }
                }
            }
        }
        for (int m = 0; m < db; m++) {
            System.out.print(tomb[m] + ",");
        }

    }
}
