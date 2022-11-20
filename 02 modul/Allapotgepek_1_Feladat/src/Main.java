import java.util.Scanner;

public class Main {
    enum ForgovillaAllapot {
        Nyitva,
        Zarva
    }

    enum ForgovillaEsemeny {
        AthaladasiKiserlet,
        AthaladasiKiserletMegszakad,
        PenzBedobas,

    }

    public static void main(String[] args) {
        //Egy alap forgóvillának két állapota van (nyitva és zárva),
        // illetve két alap eseménye (pénz bedobás és áthaladási kísérlet).
        // Az ilyen forgóvilla nem képes modellezni azt a helyzetet,
        // amikor valaki elkezd áthaladni a forgóvillán,
        // de meggondolja magát és visszafordul. Készítsen olyan forgóvilla modellt,
        // ami kezelni tudja ezt az esetet is. Határozza meg a kibővített állapotok
        // és események halmazát, és implementálja az új állapot kiszámoló függvényt ezeknek megfelelően.
        ForgovillaAllapot KapuAllapota = ForgovillaAllapot.Nyitva;

        // valami tortenik
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adja meg,hogy mit szeretne, atmenni a kapun vagy visszafordulni");
        String atmegy=sc.nextLine();

        if (KapuAllapota == ForgovillaKovetkezoAllapota(KapuAllapota,ForgovillaEsemeny.valueOf(atmegy))) {
            if (KapuAllapota == ForgovillaKovetkezoAllapota(KapuAllapota,
                    ForgovillaEsemeny.AthaladasiKiserlet)) {
                System.out.println(" Athalad a kapun ");
            } else if (KapuAllapota == ForgovillaKovetkezoAllapota(KapuAllapota,
                    ForgovillaEsemeny.AthaladasiKiserletMegszakad)) {
                System.out.println(" Visszafordult ");
            } else if (KapuAllapota == ForgovillaKovetkezoAllapota(KapuAllapota,
                    ForgovillaEsemeny.PenzBedobas)) {
                System.out.println(" Penzt dobott be ");
            }
        }
    }


    private static ForgovillaAllapot ForgovillaKovetkezoAllapota(
            ForgovillaAllapot aktualisAllapot,
            ForgovillaEsemeny aktualisEsemeny
    ) {
        switch (aktualisAllapot) {
            case Nyitva:
                switch (aktualisEsemeny) {
                    case AthaladasiKiserlet:
                    case AthaladasiKiserletMegszakad:
                        return ForgovillaAllapot.Zarva;
                    case PenzBedobas:
                        return ForgovillaAllapot.Nyitva;
                    default:
                        throw new IllegalArgumentException();
                }

        }
        return aktualisAllapot;
    }
}