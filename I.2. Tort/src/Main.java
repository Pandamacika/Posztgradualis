import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //2. Olvass be két tört számot és írd ki hogy egyenlőek-e vagy sem.

        System.out.println(" Ez a program beolvas ket tort szamot  ");
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();

        System.out.println("Kerem adja meg az elso szamot :  ");
        double tort_1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Kerem adja meg a masodik szamot : ");
        double tort_2 = sc.nextDouble();
        sc.nextLine();

        if (tort_1 > tort_2) {
            System.out.println(tort_1 + " nagyobb, mint " + tort_2);
        } else {
            if (tort_1 == tort_2) {
                System.out.println("A ket szam egyenlo");
            } else
                System.out.println(tort_1 + " kisebb, mint " + tort_2);
        }

        if (tort_1 > tort_2) {
            System.out.println(tort_1 + " nagyobb, mint " + tort_2);
        } else if (tort_1 == tort_2) {
            System.out.println("A ket szam egyenlo");
        } else
            System.out.println(tort_1 + " kisebb, mint " + tort_2);

    }
}