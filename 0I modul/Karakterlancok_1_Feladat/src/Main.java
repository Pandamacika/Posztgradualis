import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //. Olvass be egy karakterláncot, majd írd ki
        // a. a hosszát
        //b. nagybetűsített alakájt
        // c.	kisbetüsített alakját
        System.out.println(" Ez a program egy karakterlancot alakit at .");
        System.out.println(" Kerem irjon be egy szoveget : ");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        System.out.println(" Ez a beolvasott szoveg : " + szoveg);
        int ures_karakter = szoveg.indexOf(" ");
        int szoveg_hossza = szoveg.length();
        int szunet_nelkul = 0;
        if (ures_karakter != 0) {
            szunet_nelkul = szoveg_hossza - ures_karakter;
        }
        String nagy_betu = szoveg.toUpperCase();
        System.out.println(" Ez a beolvasott szoveg hossza : " + szoveg_hossza);
        System.out.println(" Ez a beolvasott szoveg hossza szunet nelkul : " + szunet_nelkul);
        System.out.println(" Ez a beolvasott szoveg nagybetuvel kiirva : " + nagy_betu);
        String kis_betu = szoveg.toLowerCase();
        System.out.println(" Ez a beolvasott szoveg kisbetuvel kiirva : " + kis_betu);

    }
}