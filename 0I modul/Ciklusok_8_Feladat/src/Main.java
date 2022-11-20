import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami bekér egy karakterláncot,
        // majd törli minden páros helyen álló karakterét és kiírja a képernyőre.
        System.out.println(" Ez a program torli a karakterlanc minden paros helyen allo karakteret . ");
        Scanner sc = new Scanner(System.in);
        String karakterlanc = sc.nextLine();
        int maradek;
        int db = 0;
        String uj_karakterlanc = karakterlanc.replace(" ", "");
        int hossz = uj_karakterlanc.length();
        char[] betuk = new char[hossz];
        int[] paros = new int[hossz];

        StringBuilder sb = new StringBuilder(uj_karakterlanc);
        for (int i = 0; i < hossz; i++) {
            betuk[i] = uj_karakterlanc.charAt(i);
        }
        for (int j = 0; j < hossz; j++) {
            System.out.print(betuk[j] + ",");
        }
        System.out.println();
        for (int k = 0; k < hossz; k++) {

            maradek = k % 2;
            if (maradek == 0) {
                paros[k] = k;
                db = db + 2;
                System.out.println(" A paros szamu karakterek : " + paros[k]);


            }
        }
        for (int j = 0; j < hossz; j++) {
            if (paros[j] == j) {
                sb.deleteCharAt(j);
                sb.replace(j, j, " ");
            }
        }


        System.out.println(" Az uj szoveg : " + sb);


    }
}