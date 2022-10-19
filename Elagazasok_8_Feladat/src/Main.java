import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérjen be egy számot 1 és 10 között és írja ki,
        // hogy helló annyiszor. Nem megfelelő szám esetén írjuk ki, hogy ejnye bejnye.
        System.out.println(" Ez a program ker egy szamot 1-10 kozott es kiirja,hogy hello ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adjon meg egy szamot 1 es 10 kozott ");
        int szam = sc.nextInt();
        if ((szam >= 1) && (szam <= 10)) {
            for (int i = 1; i <= szam; i++) {
                System.out.print("Hello" + ",");
            }
        } else
            System.out.println("ejnye bejnye");
    }
}