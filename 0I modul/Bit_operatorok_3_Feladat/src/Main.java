import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Írj egy programot, ami beolvas egy egész számot,
        // binárisan összekizáróvagyolja (XOR-olja) 512-vel, majd az eredményt kíjra.
        //Ennek a programnak a segítségével adj meg olyan számokat ami:
        // a.Kisebb mint 512 és a program kimenete 578.
        //b. Nagyobb mint 512 és a program kimenete 1030.
        // c Nagyobb mint 512 és a program kimenete 1534.
        //(próbáljuk okosan kitalálni, hogy mivel érdemes próbálkozni)
        System.out.println(" Ez a program a xor muveletet hasznalja");
        Scanner sc = new Scanner(System.in);
        int a = 512;
        int b = sc.nextInt();
        int axorb = a ^ b;
        System.out.println(" Az eredmeny : " + axorb);
        int c = 66;
        int axorc = a ^ c;
        System.out.println(" A program kimenete 578  : " + axorc);
        int d = 1542;
        int axord = a ^ d;
        System.out.println(" A program kimenete 1030  : " + axord);
        int e = 2046;
        int axore = a ^ e;
        System.out.println(" A program kimenete 1534  : " + axore);
    }
}