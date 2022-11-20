import java.util.Random;

import static java.lang.String.valueOf;


public class Main {

    public static void main(String[] args) {
        // false esetén kis tesztadatot ad a függvény
        int ossz_db = 32;
        Random rn = new Random();
        int db = rn.nextInt(32-1);
        int masik_tomb_darabszama = ossz_db - db;
        String[] cards = generateDeck(true);
        String[] cards_1 = generateDeck(true);
        String[] cards_2 = generateDeck(true);
        for (int i = 0; i < db; i++) {
            System.out.print(cards_1[i] + ",");
        }
        System.out.println();
        for (int i = db; i < masik_tomb_darabszama; i++) {
            System.out.print(cards_2[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < ossz_db; i++) {
            System.out.print(cards[i] + ",");
        }
        System.out.println();
        String[] cards_ossz = new String[ossz_db];
        for (int i = 0; i < ossz_db; i++) {
            int index = rn.nextInt(32-1);
            if (index < db){
                cards_ossz[index] = cards_1[i];}
            else{
                cards_ossz[index] = cards_2[i];}
            System.out.print(cards_ossz[index] + ",");
        }
    }


    /**
     * Generál egy pakli rendezett kártyát.
     *
     * @param fullDeck Ha igaz, akkor a teljes paklit generálja, hanem csak teszadatokat.
     */
    private static String[] generateDeck(boolean fullDeck) {
        int ossz_db = 32;
        Random rn = new Random();
        int db = rn.nextInt(32);
        int masik_tomb_darabszama = ossz_db - db;
        String[] cards_1 = new String[db];
        String[] cards_2 = new String[masik_tomb_darabszama];
        String[] deck = new String[32];
        if (fullDeck) {
            for (int i = 0; i < deck.length; i++) {
                deck[i] = getColor(i / 8) + " " + getCardId(i % 8);

            }

            for (int i = 0; i < db; i++) {
                cards_1[i] = getColor(i / 8) + " " + getCardId(i % 8);
            }

            for (int i = masik_tomb_darabszama - 1; i >= db; i--) {
                cards_2[i] = getColor(i / 8) + " " + getCardId(i % 8);
            }

            return deck;

        } else {
            // valami tesztadat fejelsztéshez
            String[] dummyDeck = new String[5];
            for (int i = 0; i < dummyDeck.length; i++) {
                dummyDeck[i] = valueOf(i);
            }
            return dummyDeck;
        }

    }

    private static String getColor(int colorCode) {
        return switch (colorCode) {
            case 0 -> "piros";
            case 1 -> "tök";
            case 2 -> "makk";
            case 3 -> "zöld";
            default ->
                // ez nem szép, de most ne foglalkozzunk vele
                    "";
        };
    }

    private static String getCardId(int cardCode) {
        return switch (cardCode) {
            case 0 -> "alsó";
            case 1 -> "felső";
            case 2 -> "király";
            case 3 -> "VII";
            case 4 -> "VIII";
            case 5 -> "IX";
            case 6 -> "X";
            case 7 -> "ász";
            default ->
                // ez nem szép, de most ne foglalkozzunk vele
                    "";
        };
    }
}