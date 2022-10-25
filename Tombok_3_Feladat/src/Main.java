import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj programot, ami be kér egy számot 1 és 5 között,
        // majd pontosan ennyi keresztnevet kér be és ezeket kiírja fordított sorrendben.

        System.out.println("Ez a beker keresztneveket es kiirja forditott sorrendben : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem adja meg hany keresztnevet olvasson be a program : ");
        int db = sc.nextInt();
        sc.nextLine();
        String[] nevek = new String[db];


        switch (db) {
            case 1 -> {
                System.out.println("Kerem adja meg a keresztnevet : ");
                nevek[0] = sc.nextLine();
                System.out.println("Egy nev van :" + nevek[0]);
            }
            case 2 -> {
                System.out.println("Kerem adja meg a keresztneveket : ");
                nevek[0] = sc.nextLine();
                nevek[1] = sc.nextLine();
                System.out.println("Ket nev van : " + nevek[1] + "," + nevek[0]);
            }
            case 3 -> {
                System.out.println("Kerem adja meg a keresztneveket : ");
                nevek[0] = sc.nextLine();
                nevek[1] = sc.nextLine();
                nevek[2] = sc.nextLine();
                System.out.println("Harom nev van : " + nevek[2] + "," + nevek[1] + "," + nevek[0]);
            }
            case 4 -> {
                System.out.println("Kerem adja meg a keresztneveket : ");
                nevek[0] = sc.nextLine();
                nevek[1] = sc.nextLine();
                nevek[2] = sc.nextLine();
                nevek[3] = sc.nextLine();
                System.out.println("Negy nev van : " + nevek[3] + "," + nevek[2] + "," + nevek[1] + "," + nevek[0]);
            }
            case 5 -> {
                System.out.println("Kerem adja meg a keresztneveket : ");
                nevek[0] = sc.nextLine();
                nevek[1] = sc.nextLine();
                nevek[2] = sc.nextLine();
                nevek[3] = sc.nextLine();
                nevek[4] = sc.nextLine();
                System.out.println("Ot nev van" + nevek[4] + "," + nevek[3] + "," + nevek[2] + "," + nevek[1] + "," + nevek[0]);
            }
            default -> System.out.println("Ez nem megfelelo szam . ");


        }


    }


}
