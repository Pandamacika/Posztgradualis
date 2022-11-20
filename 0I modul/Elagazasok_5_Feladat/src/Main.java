import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérjen be egy karaktert és döntse el,
        // hogy az kisbetű, nagybetű vagy szám
        // (ne használj beépített függvényeket,
        // hanem a karakterek kódja alapján programozz).
        System.out.println("Ez a program egy karaktert ker be eldonti,hogy betu vagy szam!");
        Scanner sc = new Scanner(System.in);
        String karakter = sc.nextLine();
        System.out.println(" A beirt adat kodja : " + karakter.hashCode());
        boolean szam_betu = karakter.chars().allMatch(Character::isDigit);
        System.out.println(" A beolvasott karakter szam-e?  : " + szam_betu);
        int kod = karakter.hashCode();
        System.out.println(" A beolvasott karakternek megfelelo ertek " + kod);
        if (szam_betu) {
            System.out.println(" A beolvasott karakter szam  ");

        } else {
            System.out.println(" A beolvasott karakter betu  ");
            boolean betu = karakter.chars().allMatch(Character::isLowerCase);
            if (betu)
                System.out.println(" A beolvasott karakter kis betuvel volt beirva ");
            else
                System.out.println(" A beolvasott karakter nagy betuvel volt beirva ");

        }
    }
}