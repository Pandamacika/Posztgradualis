import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérjen be egy számot és írja ki,
        // hogy helló annyiszor.
        // (Emlékezzünk a régi szenvedős megoldásra és értékeljük a haladást.)
        System.out.println(" Ez a feladat a bekert szam alapjan kiirja,hogy hello!");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg hanyszor irja ki a szamitogep a Hello szot : ");
        int szam = sc.nextInt();
        for (int i = 0; i < szam; i++) {
            System.out.println("Hello");
        }

    }
}