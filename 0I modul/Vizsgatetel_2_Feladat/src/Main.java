import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //(10 pont) Írjon egy programot ami egy 100 elemű
        // tömböt feltölt véletlen számokkal, majd az utolsó
        // 50 pozíción tárolt elemet egy pozícióval hátrébb tolja,
        // és az utolsó elemet az első eltolt elem eredeti helyére teszi.
        System.out.println(" Veletlen szamok ");
        Random rn = new Random();
        int db = 100;
        int[] veletlen_szamok = new int[db];
        int csere_utolso_elem;

        for (int i = 0; i < db; i++) {
            veletlen_szamok[i] = rn.nextInt(50);
            System.out.print(veletlen_szamok[i] + ",");
            if (i == ((db / 2))) {
                System.out.println();

            }
        }
        for (int i = 0; i < db; i++) {
            if (i == (db / 2)) {

                csere_utolso_elem = veletlen_szamok[i];
                veletlen_szamok[i] = veletlen_szamok[db - 1];
                veletlen_szamok[db - 1] = csere_utolso_elem;

            }
        }

        System.out.println();
        for (int i = 0; i < db; i++) {

            if ((i == db / 2)) {
                System.out.print(ConsoleColors.GREEN_BOLD + veletlen_szamok[i] + ",");
                System.out.println();
            } else if (i == (db - 1)) {
                System.out.print(ConsoleColors.GREEN_BOLD + veletlen_szamok[i] + ",");
            } else {
                System.out.print(ConsoleColors.RESET + veletlen_szamok[i] + ",");
            }
        }
    }

    public class ConsoleColors {
        public static final String RESET = "\033[0m";  // Text Reset
        public static final String GREEN_BOLD = "\033[1;32m";  // GREEN

    }
}
