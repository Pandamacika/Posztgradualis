import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Írj programot ami beolvas egy, majd eldönti, hogy az alábbi esetek közül melyik áll fenn:
        // a. a szám páratlan
        //b. a szám páros és osztható néggyel, de nem osztható nyolccal
        // c.	a szám páros és osztható nyolccal és néggyel is
        //d. a szám páros de nem osztható sem nyolccal sem néggyel
        // e. valami más féle szám

        System.out.println("Ez a program eldonti,hogy egy szam paros vagy paratlan ");
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        int eredeti_szam = szam;
        int szamjegy = szam % 10;
        System.out.println(" A szam utolso szamjegye : " + szamjegy);
        int[] paratlan = {1, 3, 5, 7, 9};
        int[] szam_felbontva = new int[5];
        int a = 0;
        for (int i = 1; i < paratlan.length; i++) {
            if (szamjegy == paratlan[i]) {
                a = a + 1;
            }
        }
        if (a != 0) {
            System.out.println(" a " + szam + " paratlan szam  ");
        } else {
            System.out.println(" a " + szam + " paros szam  ");
        }

        // b. a szám páros és osztható néggyel, de nem osztható nyolccal

        for (int i = 1; i < 5; i++) {
            szamjegy = szam % 10;
            szam = szam / 10;
            szam_felbontva[i] = szamjegy;
            System.out.println("A szam szamjegyei : " + szam_felbontva[i]);
        }
        if (a == 0) {
            double maradek_4 = eredeti_szam % 4;
            double maradek_8 = eredeti_szam % 8;
            System.out.println(" maradek_4 : " + maradek_4 + " maradek_8 : " + maradek_8);
            if ((maradek_4 == 0) && (maradek_8 != 0)) {
                System.out.println(eredeti_szam + " oszthato 4-el, de nem oszthato 8-al");
            } else if ((maradek_4 == 0) && (maradek_8 == 0)) {
                System.out.println(eredeti_szam + " oszthato 4-el es oszthato 8-al is");
            } else if ((maradek_4 != 0) && (maradek_8 != 0)) {
                System.out.println(eredeti_szam + " nem oszthato 4-el es nem oszthato 8-al sem");
            } else
                System.out.println(" A szam nem felel meg a felteteleknek : ");


        }
    }
}