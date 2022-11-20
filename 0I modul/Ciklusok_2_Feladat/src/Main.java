
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Egyszerű palindrom teszt: Írjon programot
        // amely beolvas egy karakterláncot és arról eldönti,
        // hogy az visszafelé olvasva tökéletesen megegyezik-e önmagával.
        System.out.println("Palindrom teszt");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        String uj_szoveg = szoveg.replace(" ", "");
        System.out.println(uj_szoveg);
        int betuk_szama = uj_szoveg.length();
        StringBuilder szoveg_betui_megforditva = new StringBuilder();


        for (int i = betuk_szama - 1; i >= 0; i--) {
            char iDikKarakter = uj_szoveg.charAt(i);
            szoveg_betui_megforditva.append(iDikKarakter);


        }

        System.out.println(szoveg_betui_megforditva);
        int a = 0;
        for (int j = 0; j < betuk_szama; j++) {

            if (uj_szoveg.charAt(j) != szoveg_betui_megforditva.charAt(j)) {
                a = a + 1;
            } else
                a = 0;
        }
        System.out.println("az a valtozo  : " + a);
        System.out.println("ures karakter nelkul : " + szoveg_betui_megforditva);
        if (a != 0) {
            System.out.println(" Ez  nem palindrom ! " + uj_szoveg + " != " + szoveg_betui_megforditva);
        } else {
            System.out.println(" Ez palindrom ! " + uj_szoveg + " = " + szoveg_betui_megforditva);
        }
    }
}