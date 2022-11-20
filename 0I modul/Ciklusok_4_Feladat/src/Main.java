import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írjon programot ami addig olvas be karakterláncokat
        // ameddig azt nem adjuk meg neki, hogy Exit.
        // Minden beolvasott karakterláncot írjon is ki azonnal fordítva, de az Exit-et már ne.
        System.out.println(" Ez a program karakterlancokat olvas be,amig Exit szot nem kap . ");
        Scanner sc = new Scanner(System.in);
        String kilepes = "exit";


        for (int i = 0; i < 10; i++) {
            String szoveg = sc.nextLine();
            int karakter_hossza = szoveg.length();
            StringBuilder szoveg_betui_megforditva = new StringBuilder();
            switch (i) {
                case 0, 1 -> {
                    if (szoveg.charAt(i) != kilepes.charAt(i)) {
                        for (int j = karakter_hossza - 1; j >= 0; j--) {
                            char karakter = szoveg.charAt(j);
                            szoveg_betui_megforditva.append(karakter);
                        }
                        System.out.println(szoveg_betui_megforditva);
                        i = 0;

                    } else if (szoveg.charAt(i) == kilepes.charAt(i)) {

                        System.out.println(" Vege");
                        i = 21;

                    }
                }
                default -> System.out.println(" Hiba ");

            }
        }

    }
}


