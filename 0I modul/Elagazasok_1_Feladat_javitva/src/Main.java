import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Írj programot ami beolvas egy szamot, majd eldönti, hogy az alábbi esetek közül melyik áll fenn:
        // a. a szám páratlan
        //b. a szám páros és osztható néggyel, de nem osztható nyolccal
        // c.	a szám páros és osztható nyolccal és néggyel is
        //d. a szám páros de nem osztható sem nyolccal sem néggyel
        // e. valami más féle szám

        System.out.println("Ez a program eldonti,hogy egy szam paros vagy paratlan ");
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        int[] paratlan = {1, 3, 5, 7, 9};
        int a = 0;
        for (int i = 0; i < 5; i++) {
            if ((szam % 10) == paratlan[i]) {
                System.out.println(" a " + szam + " paratlan szam  ");
                a++;
            }
        }
        // b. a szám páros és osztható néggyel, de nem osztható nyolccal
        if (a == 0) {
            double maradek_4 = szam % 4;
            double maradek_8 = szam % 8;
            System.out.println(" maradek_4 : " + maradek_4 + " maradek_8 : " + maradek_8);
            if ((maradek_4 == 0) && (maradek_8 != 0)) {
                System.out.println(szam + " oszthato 4-el, de nem oszthato 8-al");
            } else if ((maradek_4 == 0) && (maradek_8 == 0)) {
                System.out.println(szam + " oszthato 4-el es oszthato 8-al is");
            } else if ((maradek_4 != 0) && (maradek_8 != 0)) {
                System.out.println(szam + " nem oszthato 4-el es nem oszthato 8-al sem");
            } else
                System.out.println(" A szam nem felel meg a felteteleknek : ");


        } else {
            System.out.println(" A " + szam + " paratlan szam nem oszthato sem 4-el sem 8-al ");
        }
    }
}
