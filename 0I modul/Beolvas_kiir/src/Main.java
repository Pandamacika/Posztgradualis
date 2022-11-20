import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Olvass be két egész számot és írd ki a
        //a. összegüket
        //b. különbségüket
        //c. szorzatukat
        //d. maradékos osztási hányadosukat e. osztási maradékukat

        System.out.println("Ez a programresz ket szam osszeget, kulonbseget, hanyadosat es maradekat szamolja ki : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerem az elso szamot : ");
        int szam = sc.nextInt();
        sc.nextLine();

        System.out.println("Az elso szam:" + szam);
        System.out.println("Kerem a masodik szamot : ");
        int szam2 = sc.nextInt();
        sc.nextLine();

        System.out.println("A masodik szam : " + szam2);
        int osszeg = szam + szam2;
        System.out.println("A ket szam osszege : " + osszeg);
        int kulonbseg = szam - szam2;

        System.out.println("A ket szam kulonbsege : " + kulonbseg);
        int szorzat = szam * szam2;
        System.out.println("A ket szam szorzata : " + szorzat);
        int hanyados = szam / szam2;
        System.out.println("A ket szam osztasi hanyadosa : " + hanyados);
        int maradek = szam % szam2;
        System.out.println("A ket szam osztasanak maradeka : " + maradek);
    }
}