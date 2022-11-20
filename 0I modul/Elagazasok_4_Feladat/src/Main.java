import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérjen be egy számot 1 és 7 közöt és írja ki,
        // hogy az a szám a hét melyik napjának felel meg
        // (hétfő, kedd, ...). Ha nem megfelelő számot adott
        // meg a felhasználó, írd ki, hogy ejnye bejnye.
        System.out.println(" Ez a program a het napjait irja ki ! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adjon meg egy szamot 1 es 7 kozott");
        int szam = sc.nextInt();
        switch (szam) {
            case 1 -> System.out.println("Hetfo");
            case 2 -> System.out.println("Kedd");
            case 3 -> System.out.println("Szerda");
            case 4 -> System.out.println("Csutortok");
            case 5 -> System.out.println("Pentek");
            case 6 -> System.out.println("Szombat");
            case 7 -> System.out.println("Vasarnap");
            default -> System.out.println("Ejnye - bejnye");
        }


    }
}