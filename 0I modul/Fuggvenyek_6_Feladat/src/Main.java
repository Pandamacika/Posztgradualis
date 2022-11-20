import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Egészítse ki a 8.4 feladatot egy olyan adminisztrátor menüvel,
        // amiben meg lehet változtatni az italok árát. Ha ezt a menüt kéri a felhasználó,
        // akkor újra írjuk ki a lehetséges italokat, amiből ki lehet választani,
        // hogy melyik ára változzon meg. Ez után meg lehet adni az új árat,
        // majd visszalépünk a főmenübe. Innen a változott árakkal íródik ki a jókívánság.
        //Gondolja át, hogy mely változókat érdemes átalakítani globálissá,
        // illetve a függvényeket is szükséges lehet átszervezni az eredeti megoldásának függvényében.
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
        String[] erteke_lejben = {" 1  ",
                " 1  ",
                " 1  ",
                " 1  ",
                " 1  ",
                " 1  ",
                " 2  ",
                " 2  ",
                ""};
        int[] opcio = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Kiirja_a_valasztekot(db, automata, erteke_lejben, opcio);
        System.out.println(" Kerem adja meg melyik termek arat szeretne modositani : ");
        kicsereli_az_arat(db, erteke_lejben);
        Kiirja_a_valasztekot(db, automata, erteke_lejben, opcio);
        extracted(db, automata, erteke_lejben);
    }

    private static void kicsereli_az_arat(int db, String[] erteke_lejben) {
        Scanner sc = new Scanner(System.in);
        String a_cserelendo_termek_szama = sc.nextLine();
        System.out.println(" Kerem adja meg,hogy mire szeretne cserelni : ");
        String a_cserelendo_ar = sc.nextLine();
        String csere;
        for (int i = 0; i < db; i++) {
            if (Integer.parseInt(a_cserelendo_termek_szama) != 9) {
                if (i == (Integer.parseInt(a_cserelendo_termek_szama) - 1)) {
                    csere = erteke_lejben[i];
                    erteke_lejben[i] = a_cserelendo_ar;
                    a_cserelendo_ar = csere;
                }
            } else {
                System.out.println(" Viszont latasra ");
                break;
            }
        }
    }

    private static void Kiirja_a_valasztekot(int db, String[] automata, String[] erteke_lejben, int[] opcio) {
        String[] kiiras = new String[db];
        for (int i = 0; i < db; i++) {
            kiiras[i] = opcio[i] + automata[i] + erteke_lejben[i];
            System.out.println(kiiras[i]);
        }
    }

    private static void extracted(int db, String[] automata, String[] erteke_lejben) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem valasszon es irja be a szamat : ");
        int bekeri_a_szamat;
        for (int j = 0; j < db; j++) {
            bekeri_a_szamat = sc.nextInt();
            j = bekeri_a_szamat - 1;
            if (bekeri_a_szamat != 9) {

                System.out.println(" On a(z) " + automata[j] + " -t valasztotta." + erteke_lejben[j] + " lej . Várja meg míg elkészül és fogyassza egészséggel.");
            } else {
                System.out.println(" Viszont latasra ");
                break;
            }
        }
    }
}