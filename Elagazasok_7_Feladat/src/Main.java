
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kéjen be három számot, ami évszámot,
        // hónap számot és nap számot jelent.
        // Döntse el, hogy a megadott adatok a 20. század valamelyik napját jelentik-e vagy sem.
        System.out.println("Ez a program evszamokat ellenoriz");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg az evszamot : ");
        int evszam = sc.nextInt();
        System.out.println(" Kerem adja meg a honapot : ");
        int honap = sc.nextInt();
        System.out.println(" Kerem adja meg a napot : ");
        int nap = sc.nextInt();
        LocalDate datum = LocalDate.now();
        System.out.println(" A mai datum : " + datum);
        System.out.println(" Az On altal megadott evszam : " + evszam + "." + honap + "." + nap);
        if ((evszam < 2000) && (evszam > 1901)) {
            System.out.println(" A datum  a 20. szazad egy napjat jeleniti meg . ");
        } else {
            if ((evszam > 2000) && (evszam < 2100))
                System.out.println(" A datum a 21. szazad egy napjat jeleniti meg . ");
            else
                System.out.println(" A datum nem a 20. szazad egy napjat jeleniti meg . ");
        }


    }
}