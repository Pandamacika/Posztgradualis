import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérjen be egy karaktert és írja ki
        // a nagybetűsített változatát
        // (ne használj beépített függvényeket, hanem a karakterek kódja alapján programozz).
        System.out.println("Ez a program egy karakter nagybetus valtozatat irja ki");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adjon meg egy betut : ");
        String karakter = sc.nextLine();
        String nagy_betu = karakter.toUpperCase();
        System.out.println(" A betu nagybetuvel irva " + nagy_betu);

    }
}