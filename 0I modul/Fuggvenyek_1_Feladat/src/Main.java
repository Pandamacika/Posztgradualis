import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // (padding) Írj egy függvényt ami egy karakterláncot kiegészít adott hosszúságúra.
        // A függvény paraméterként várja a kiegészítendő karakterláncot, a kiegészítéshez használatos karaktert, az
        //elérni kívánt hosszt valamint azt, hogy a karakterlánc elejére vagy végére kerüljenek a kitöltő karakterek.

        System.out.println(" Ez a program egy karakterlancot kiegeszit adott hosszusagra . ");
        System.out.println(" Elol potolja egy A betuvel a karakterlancot : ");
        kiegesziti_a_szoveget("A", "elso", 10);
        System.out.println(" Hatul potolja egy A betuvel a karakterlancot : ");
        kiegesziti_a_szoveget("A", "utolso", 10);
    }

    public static void kiegesziti_a_szoveget(String kiegeszito_karakter, String hely, int hosszusag) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adjon meg egy karakterlancot : ");
        String karakterlanc = sc.nextLine();
        String eredmeny = "";
        int szabad_helyek_hossza = hosszusag - karakterlanc.length();
        if (hely.equals("elso")) {
            switch (szabad_helyek_hossza) {
                case 1 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(1) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 2 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(2) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 3 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(3) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 4 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(4) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 5 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(5) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);

                }
                case 6 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(6) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 7 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(7) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 8 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(8) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);

                }
                case 9 -> {
                    eredmeny = eredmeny + kiegeszito_karakter.repeat(9) + karakterlanc;
                    System.out.println("Az eredmeny : " + eredmeny);
                }

            }

        } else if (hely.equals("utolso")) {
            switch (szabad_helyek_hossza) {
                case 1 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(1);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 2 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(2);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 3 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(3);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 4 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(4);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 5 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(5);
                    System.out.println("Az eredmeny : " + eredmeny);

                }
                case 6 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(6);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 7 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(7);
                    System.out.println("Az eredmeny : " + eredmeny);
                }
                case 8 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(8);
                    System.out.println("Az eredmeny : " + eredmeny);

                }
                case 9 -> {
                    eredmeny = eredmeny + karakterlanc + kiegeszito_karakter.repeat(9);
                    System.out.println("Az eredmeny : " + eredmeny);
                }

            }

        }
    }
}