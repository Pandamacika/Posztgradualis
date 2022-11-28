
import java.util.Scanner;

public class Main {
    //Írjon rekurzív algoritmust, ami egy tört számot megszoroz
    // egy egész számmal, kizárólag összeadás művelet használatával.


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Kerem adjon meg egy tort szamot :");
//        double tort_szam;
//        tort_szam = sc.nextDouble();
//        System.out.println("Kerem adjon meg egy egesz szamot amivel a tort szamot szorozni szeretne : ");
//        int egesz_szam = sc.nextInt();
       double szorzat = Szorzat(1.2, 4);


        System.out.println("A szamok szorzatanak eredmenye : " + szorzat);
    }


    // 0*4 = 0
    // 1*4 = 4
    // 2*4 = 4+4
    // 3*4 = 4+4+4
    // 4*4 = 4+4+4+4
    // 5*4 = (4+4+4+4+4)
    // 6*4 = (4+4+4+4+4)+4 = (6-1)*4 + 4

    // n*4 = (n-1)*4  + 4
    // n = 2 -> 2*4 = (2-1)*4  + 4, igaz
    // n = 1 -> 1*4 = (1-1)*4  + 4, igaz
    // n = 0 -> 0*4 = (0-1)*4  + 4, igaz
    // n = -1 -> -1*4 = (-1-1)*4  + 4, igaz
    // n = -1000 -> -1000*4 = (-1000-1)*4  + 4, igaz
    private static double Szorzat(double szorzando, int szorzo) {
        if (szorzo == 0) {
            return 0;
        }

        // n = szorzo, 6,7,8,9
        // x = szorzando 1.2
        // n*x = (n-1)*x  + x
        double kisebbFeladatEredmenye = Szorzat(szorzando, szorzo - 1);

        double eredmeny = kisebbFeladatEredmenye + szorzando;

        return eredmeny;
    }
}


