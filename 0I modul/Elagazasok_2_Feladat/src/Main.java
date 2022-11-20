import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kérj be két számot, majd kérd be,
        // hogy számtani vagy mértani középarányost szeretnénk számolni.
        // Számold és írd ki a kért művelet eredméyét.
        System.out.println(" Ez a program szamtani illetve mertani kozeparanyost szamol . ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kerem adjon meg ket szamot . Az elso szam : ");
        double a = sc.nextDouble();
        System.out.println(" Kerem adja meg a masodik szamot : ");
        double b = sc.nextDouble();
        double c;
        System.out.println(" Kerem irjon egy s betut,ha szamtani kozeparanyost szeretne szamolni es egy m betut,ha mertani kozeparanyost szeretne szamolni");
        String valaszt = sc.next();
        if (valaszt.equals("s")) {
            c = (a + b) / 2;
            System.out.println(" A ket szam szamtani kozeparanyosa : " + c);
        } else if (valaszt.equals("m")) {
            System.out.println(" A ket szam mertani kozeparanyosa : " + Math.sqrt(a * b));
        }
    }
}