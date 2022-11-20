import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Olvass be két 8 bites egész számot és írd ki,
        // egész mondatban, hogy melyik a nagyobb.
        // (pl.: 5 és 6 estén: 6 nagyobb mint 5. 5 és 5 esetén: 5 egyenlő 5.)

        System.out.println("Ez a feladat ket 8 bites szamot hasonlit ossze ");
        Scanner sc = new Scanner(System.in);

        System.out.println(" Kerem adjon meg egy szamot : ");
        byte a = sc.nextByte();
        System.out.println(" Kerem adjon meg egy masik szamot : ");
        byte b = sc.nextByte();
        if (a > b) {
            System.out.println(a + " nagyobb, mint " + b);
        } else if (a < b) {
            System.out.println(a + " kissebb, mint " + b);
        } else {
            System.out.println(a + " egyenlo " + b);
        }
    }
}