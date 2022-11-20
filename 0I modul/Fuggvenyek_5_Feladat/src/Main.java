import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írjon egy kávé autómata tesztelését segítő alkalmazást.
        // A program úgy működik, hogy a képernyőre kiír egy 5 menüpontból álló programot:
        //a. Espresso, rövid, cukorral – 1
        //b. Espresso, rövid, tejjel és cukorral – 1
        // c.	Espresso, hosszu, cukorral – 1
        //d. Espresso, hosszu, tejjel és cukorral – 1
        // e. Cappuccino-1
        //f.	Olasz Cappuccino-1
        // g.	Moccaccino-2
        //h. Forró csoki-2
        // i.	Kilépés
        //A menü kiírása után bekéri az opció menükódját, majd kiírja, hogy „Ön egy XXXX-t vett ZZZZ lejért.
        // Várja meg míg elkészül és fogyassza egészséggel.”
        System.out.println(" Ez a program egy automata teszteleset segito alkalmazas ! ");
        int db = 9;
        String[] automata = {" Espresso, rövid, cukorral ",
                " Espresso, rövid, tejjel és cukorral ",
                " Espresso, hosszu, cukorral ",
                " Espresso, hosszu, tejjel és cukorral ",
                " Cappuccino ",
                " Olasz Cappuccino ",
                " Moccaccino ",
                " Forró csoki ",
                " Kilepes"};
        String[] erteke_lejben = {" 1 lej ",
                " 1 lej ",
                " 1 lej ",
                " 1 lej ",
                " 1 lej ",
                " 1 lej ",
                " 2 lej ",
                " 2 lej ",
                ""};
        int[] opcio = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] kiiras = new String[db];
        for (int i = 0; i < db; i++) {
            kiiras[i] = opcio[i] + automata[i] + erteke_lejben[i];
            System.out.println(kiiras[i]);
        }
        extracted(db, automata, erteke_lejben);

    }

    private static void extracted(int db, String[] automata, String[] erteke_lejben) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem valasszon es irja be a szamat : ");
        int bekeri_a_szamat;
        for (int j = 0; j < db; j++) {
            bekeri_a_szamat = sc.nextInt();
            j = bekeri_a_szamat - 1;
            if (bekeri_a_szamat != 9) {

                System.out.println(" On a(z) " + automata[j] + " -t valasztotta." + erteke_lejben[j] + " . Várja meg míg elkészül és fogyassza egészséggel.");
            } else {
                System.out.println(" Viszont latasra ");
                break;
            }
        }
    }
}