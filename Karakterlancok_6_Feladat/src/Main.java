
import java.util.Random;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        //Írj egy programot ami véletlenszerűen egyenletesen választ
        // egy hossz értéket 5 és 10 között (5 és 10 is lehet),
        // majd generál egy olyan véletlen karakterláncot,
        // aminek hossza ez a szám. A karakterei pedig kizárólag kis betűk,
        // nagy betűk, vagy számok. Pl: hossz 7, karakterlánc: aFst5Gw.

        out.println(" Veletlen szamok : ");
        Random rn = new Random();
        int karakterlanc_hossza = rn.nextInt(10 - 5 + 1) + 5;
        out.println(" A karakterlanc hossza : " + karakterlanc_hossza);

        out.println(" A veletlen szeruen kiirt szamok es betuk : ");


        switch (karakterlanc_hossza) {

            case 5 -> {

                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');

                String osszevonva = a + String.valueOf(b) + c + d + e;
                out.print(osszevonva);
            }

            case 6 -> {
                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char f = (char) (rn.nextInt('9' - '0' + 1) + '0');
                String osszevonva = a + String.valueOf(b) + c + d + e + f;
                out.print(osszevonva);
            }


            case 7 -> {

                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char f = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char g = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                String osszevonva = a + String.valueOf(b) + c + d + e + f + g;
                out.print(osszevonva);
            }

            case 8 -> {

                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char f = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char g = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char h = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                String osszevonva = a + String.valueOf(b) + c + d + e + f + g + h;
                out.print(osszevonva);
            }


            case 9 -> {

                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char f = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char g = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char h = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char i = (char) (rn.nextInt('9' - '0' + 1) + '0');
                String osszevonva = a + String.valueOf(b) + c + d + e + f + g + h + i;
                out.print(osszevonva);

            }
            case 10 -> {
                char a = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char b = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char c = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char d = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char e = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char f = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char g = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                char h = (char) (rn.nextInt('Z' - 'A' + 1) + 'A');
                char i = (char) (rn.nextInt('9' - '0' + 1) + '0');
                char j = (char) (rn.nextInt('z' - 'a' + 1) + 'a');
                String osszevonva = a + String.valueOf(b) + c + d + e + f + g + h + i + j;
                out.print(osszevonva);

            }
        }
    }
}

