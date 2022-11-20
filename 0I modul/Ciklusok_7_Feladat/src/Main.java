import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami karakterláncokat kér be
        // addig amígy *-ot nem kap,
        // majd kiírja a leghoszabb megadott karakterlánc hosszát.
        System.out.println(" Ez a program a leghosszabb karakterlanc hosszat adja meg . ");
        Scanner sc = new Scanner(System.in);
        int db = 10;
        int[] hossz = new int[db];
        String[] mondatok = new String[db];
        String kilepes = "*";
        int beolvasott_szavak = 0;
        int maximum = 0;
        for (int i = 0; i < db; i++) {
            mondatok[i] = sc.nextLine();
            StringBuilder szoveg = new StringBuilder();
            hossz[i] = mondatok[i].length();
            if (!mondatok[i].equals(kilepes)) {
                szoveg.append(mondatok[i]);
                hossz[i] = mondatok[i].length();
                beolvasott_szavak = beolvasott_szavak + 1;
            } else {
                System.out.println(" Vege ");
                for (int j = 1; j < beolvasott_szavak; j++) {
                    maximum = Math.max(hossz[j], hossz[j - 1]);

                }
                System.out.println(" a leghosszabb szoveg : " + maximum);
                break;
            }
            System.out.println(szoveg);
        }
    }
}

